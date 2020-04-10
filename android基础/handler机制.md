## 问题1：简述handler机制？
##### 参考文章: 
##### https://xujiaojie.github.io/2017/08/06/%E6%B7%B1%E5%85%A5%E7%90%86%E8%A7%A3Android%E7%9A%84Handler%E6%9C%BA%E5%88%B6/
##### https://cloud.tencent.com/developer/article/1011551
##### 参考答案: 
##### handler向MessageQueue发送消息，Looper.loop()死循环查找消息，查找到消息后执行msg.target.dispatchMessage(msg)，及handler的dispatchMessage方法来执行消息。
## 问题2：Looper.loop()如何实现死循环阻塞等待而不死机？
#### 参考文章: https://blog.csdn.net/happylishang/article/details/77747250
#### 参考答案: 在MessageQueue的next()函数中调用了native方法，native通过linux的epoll机制实现睡眠唤醒和CPU资源的出让
## 问题3：Handler，MessageQueue，Looper三者的持有关系？
#### 参考答案: Looper通过ThreadLocal实现每个Thread都有一个副本（必须调用prepare该线程才有副本），在类初始化的时候初始化一个MessageQueue，handler通过当所在Thread获取Looper对象，并同时持有Looper的MessageQueue对象，子线程初始化handler如果没有先执行Looper.prepare()会崩溃报错！
## 问题4：ThreadLocal在Looper中如何运用的？
#### [ThreadLocal](https://github.com/knowledgeIsMoney/android-interveiw/blob/master/java%E5%9F%BA%E7%A1%80/ThreadLocal.md)
## 问题5：message执行的优先级？
#### 优先级靠事件时间管理when属性
## 问题6：handler导致内存泄漏原因？
#### 参考文章：https://www.jianshu.com/p/49a70aeb555b
#### 参考答案：Message会持有一个对Handler的引用，当这个Handler是非静态内部类的时候，又会持有一个对外部类比如activity的引用，如果发送一条延时的Message，这个message会长时间持有这个activity的引用导致activity内存不释放
## 问题7：handler导致内存泄漏解决办法？
#### 参考答案：静态内部类加弱引用持有activity对象，另一种优雅的写法：将WeakReference封装在BaseHandler类中（http://www.ishenping.com/ArtInfo/177913.html）
