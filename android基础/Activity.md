## activity声明周期？
![activity声明周期](https://github.com/knowledgeIsMoney/android-interveiw/blob/master/images/%E7%94%9F%E5%91%BD%E5%91%A8%E6%9C%9F.jpg)
## A启动B的生命周期过程？
    AActivity: onPause
    BActivity: onCreate
    BActivity: onStart
    BActivity: onResume
    AActivity: onStop
## B返回A的生命周期过程？
    BActivity: onPause
    AActivity: onRestart
    AActivity: onStart
    AActivity: onResume
    BActivity: onStop
    BActivity: onDestroy

## 启动模式有哪几种？
    standard、singleTop、singleTask、singleInstance
    https://blog.csdn.net/mynameishuangshuai/article/details/51491074
    
## AActivity是singleTop的再启动AActivity会怎么走声明周期？
    onPause
    onNewIntent
    onResume
