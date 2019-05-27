## 问题1：touch事件分发流程？
#### 参考文章：
  https://juejin.im/post/58d8cba45c497d005702d46b
  https://blog.csdn.net/timshinlee/article/details/75093872
#### 参考答案：activity通过phoneWindow分发touch事件，phoneWindow再交给DecorView，由DecorView开始向子view分发（dispatchTouchEvent）,首先由onInterceptTouchEvent方法判断是否拦截事件，不拦截则向下分发，拦截则交由本级onTouchEvent处理,子view由onTouchEvent处理
