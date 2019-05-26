## 生命周期
参考文章：https://blog.csdn.net/carson_ho/article/details/53160137

startservice：onCreate，onStartCommand，onStart，onDestory

bindservice：onCreate，onBind，onUnbind，onDestory

注意点：   
       
       1.onCreate若service已启动则不再调用
       2.多次bindservice只会走一次onbind
       3.所有bind全部unbind,bind、unbind的关键是以ServiceConnection对象为核心的，如果startservice要有stopservice，否则service不会走ondestory停止服务。
       4.多次绑定可能会出问题，要特别小心
       
多次绑定问题参考文章：https://blog.csdn.net/u013553529/article/details/54754491
## service中该如何做耗时操作？
#### 使用IntentService，在IntentService的onCreate中初始化了一个HandlerThread，在onHandleIntent方法中就是异步线程了
