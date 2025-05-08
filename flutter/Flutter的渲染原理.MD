setState 是如何更新 UI 的？
----

Widget、Element、RenderObject 三棵树之间的关系是怎样的？Layer Tree 又是什么，又为什么要搞这么多 Tree ？
----
我们常用的 StatefulWidget、StatelessWidget，再加上 ProxyWidget 和 RenderObjectWidget 都继承于 Widget 基类，他们整体构成了 Widget 的骨架。

https://p3-juejin.byteimg.com/tos-cn-i-k3u1fbpfcp/254b3dba38824ed6975cb017dc46aa92~tplv-k3u1fbpfcp-zoom-in-crop-mark:1512:0:0:0.awebp
https://i-blog.csdnimg.cn/blog_migrate/a659f04dad082c6b95c09be1a6283b5d.png

https://p3-juejin.byteimg.com/tos-cn-i-k3u1fbpfcp/f0ca986759a04a43bf940a00b99208eb~tplv-k3u1fbpfcp-zoom-in-crop-mark:1512:0:0:0.awebp
performRebuild 内部先通过调用 build 方法产生一个 newWidget。
为了提升渲染性能，我们希望尽可能少的对 Element 进行操作，需要对新老 Widget 进行比较。
先验空，新 widget 是空、老 widget 非空，相当于目前 Widget Tree 子树已经没了，而原来有，所以需要将 老 widget 对应的老 Element 移除出 Element Tree，流程结束；反之，新 widget 非空、老 widget 为空，需要将新 widget 对应的 Element 创建出来，并挂载到 Element Tree （inflateWidget）。
如果二者都不为空，则开始真正的比较过程。
先用 “==” 比较引用，如果引用都相等，说明是完全相同的两个 Widget，对于有 multichild 的 widget，需要进一步比较 slot，slot 为子 widget 在父 widget 的位置标识，如果更新只需要交换兄弟节点的位置即可，流程结束。
如果二者引用值不同，将进一步调用 Widget 的静态方法 canUpdate，如果返回 true，则表示可以直接更新 widget，而不需要变更 Element；反之，则还是认为新老 Widget 有本质的不同，此时需要将原 Element 从 Tree 中移除，并 inflate 新的 Element。
持续循环，如果碰到没有上述中断流程，将一直遍历到子树的叶子节点。


主题 Theme 变化为何可以全局换肤？
-----


skia简介
----
https://p6-juejin.byteimg.com/tos-cn-i-k3u1fbpfcp/3d5bf360cf944e2ab413b60b93c31515~tplv-k3u1fbpfcp-zoom-in-crop-mark:1512:0:0:0.awebp





参考文章：
https://juejin.cn/post/6874737011325059086 
