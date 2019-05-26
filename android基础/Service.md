## 生命周期
参考文章：https://blog.csdn.net/carson_ho/article/details/53160137
startservice：onÇreate，onStartCommand，onStart，onDestory
bindservice：onCreate，onBind，onUnbind，onDestory
注意点：1.onCreate若service已启动则不再调用
       2.同一个Activity多次bindservice只会走一次unbind，不同activity bindservice才会多次onbind
       3.所有bind全部unbind，如果startservice要有stopservice，否则service不会走ondestory停止服务。
### 
