## 简述handler机制？
#### 参考文章: https://xujiaojie.github.io/2017/08/06/%E6%B7%B1%E5%85%A5%E7%90%86%E8%A7%A3Android%E7%9A%84Handler%E6%9C%BA%E5%88%B6/
####          https://cloud.tencent.com/developer/article/1011551
#### handler向MessageQueue发送消息，Looper.loop()死循环查找消息，查找到消息后执行msg.target.dispatchMessage(msg)，及handler的dispatchMessage方法来执行消息。
## Looper.loop()如何实现死循环阻塞等待而不死机？
#### 参考文章: https://blog.csdn.net/happylishang/article/details/77747250
#### 在MessageQueue的next()函数中调用了native方法，native通过linux的epoll机制实现睡眠唤醒和CPU资源的出让
## Handler，MessageQueue，Looper三者的持有关系？
#### Looper通过ThreadLocal实现每个Thread都有一个副本（必须调用prepare该线程才有副本），在类初始化的时候初始化一个MessageQueue，handler通过当所在Thread获取Looper对象，并同时持有Looper的MessageQueue对象，子线程初始化handler如果没有先执行Looper.prepare()会崩溃报错！

