## 问题3：两个viewpager嵌套实现左滑右滑子父view联动，解决滑动冲突？
#### 内层viewpager重写dispatchTouchEvent方法，监听到touch事件时getParent().requestDisallowInterceptTouchEvent(true)；getParent().requestDisallowInterceptTouchEvent(false)；阻止父viewpager拦截事件，不过最新版本貌似直接嵌套两个viewpager就可以了不需要解决冲突
