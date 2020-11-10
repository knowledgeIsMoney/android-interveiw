## 问题1：touch事件分发流程？
#### 参考文章：
  https://juejin.im/post/58d8cba45c497d005702d46b
  https://blog.csdn.net/timshinlee/article/details/75093872
#### 参考答案：activity通过phoneWindow分发touch事件，phoneWindow再交给DecorView，由DecorView开始向子view分发（dispatchTouchEvent），ViewGroup的dispatchTouchEvent方法中,首先判断临时变量intercepted，如果是ACTION_DOWN且mFirstTouchTarget!=null，由onInterceptTouchEvent方法判断是否拦截事件，不拦截则向下分发，拦截则交由本级onTouchEvent处理,子view由onTouchEvent处理,以上为Down事件机制，之后的事件会先判断mFirstTouchTarget是否为空mFirstTouchTarget不为空则直接由此向下分发，提高分发效率
## 问题2：什么条件会收到ACTION_CANCEL？
#### 参考答案：子控件消费down事件后，如果父控件拦截了后续事件，则子控件将收到cancel事件，例如滑动到父view的外面去
## 问题3：两个viewpager嵌套实现左滑右滑子父view联动，解决滑动冲突？
#### 参考答案：(https://github.com/knowledgeIsMoney/android-interveiw/blob/master/%E8%BF%9B%E9%98%B6%E9%A2%98/%E4%B8%A4%E4%B8%AAviewpager%E5%B5%8C%E5%A5%97%E5%AE%9E%E7%8E%B0%E5%B7%A6%E6%BB%91%E5%8F%B3%E6%BB%91%E5%AD%90%E7%88%B6view%E8%81%94%E5%8A%A8%EF%BC%8C%E8%A7%A3%E5%86%B3%E6%BB%91%E5%8A%A8%E5%86%B2%E7%AA%81.md)

## 滑动冲突解决的各种例子？
