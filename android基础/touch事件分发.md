## 问题1：touch事件分发流程？
#### 参考文章：
  https://juejin.im/post/58d8cba45c497d005702d46b
  https://blog.csdn.net/timshinlee/article/details/75093872
#### 参考答案：activity通过phoneWindow分发touch事件，phoneWindow再交给DecorView，由DecorView开始向子view分发（dispatchTouchEvent）,首先由onInterceptTouchEvent方法判断是否拦截事件，不拦截则向下分发，拦截则交由本级onTouchEvent处理,子view由onTouchEvent处理
## 问题2：什么条件会收到ACTION_CANCEL？
#### 参考答案：子控件消费down事件后，如果父控件拦截了后续事件，则子控件将收到cancel事件，例如滑动到父view的外面去
