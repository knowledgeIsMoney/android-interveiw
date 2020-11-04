## 何时可以获取宽高？
#### 参考文章：https://blog.csdn.net/hardworkingant/article/details/77278811
#### onCreate，onstart，onresume都不可以获得view的宽高，最简单的获取方法是调用view的post方法在runnable中获取。其他方法在参考文章中
## 渲染经历的哪几个方法？
#### onMeasure测量宽高，onLayout在父布局的位置及margin等，onDraw画的步骤
## onDraw的调用时机
