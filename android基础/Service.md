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
##### 其他异步方法
## startService与bindService区别？
#### startService启动service，不能交互，Service自己运行
#### bindService 可以绑定service建立连接，可以通过Ibinder与service通讯
## service如何保活
#### 矩阵拉起
#### <intent-filter android:priority="1000">设置高优先级
#### https://segmentfault.com/a/1190000018424447
