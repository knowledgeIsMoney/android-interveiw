## 问题1：SharedPreferences底层实现是什么？
#### 参考答案：使用xml文件存储键值对
## 问题2：SharedPreferences的commit和apply的区别？
#### 参考答案：commit是同步操作，apply是异步操作
## 问题3：SharedPreferences是线程安全的么？是进程安全的么？
#### 参考答案：SharedPreferences 是线程安全的. 内部由大量 synchronized 关键字保障，SharedPreferences 不是进程安全的
## 问题4：SharedPreferences如何实现进程安全？
#### 参考文章： https://juejin.im/entry/590833711b69e60058eb34b9
#### 参考答案：使用ContentProvider封装，


参考文章：https://blog.csdn.net/qq_16188829/article/details/78597427
apply可能会导致主线程anr，使用要谨慎，最好是使用子线程commit
