## 何时可以获取宽高？
#### 参考文章：https://blog.csdn.net/hardworkingant/article/details/77278811
#### onCreate，onstart，onresume都不可以获得view的宽高，最简单的获取方法是调用view的post方法在runnable中获取。其他方法在参考文章中
## 渲染经历的哪几个方法？
#### onMeasure测量宽高，onLayout在父布局的位置及margin等，onDraw画的步骤
## onDraw的调用时机
## https://juejin.im/post/6844903502276198407
## 看draw使用调用，draw调用取决于PFLAG_SKIP_DRAW标志位，PFLAG_DIRTY_OPAQUE决定是否调用onDraw
