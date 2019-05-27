#### 参考文章
        https://juejin.im/post/5b3a3a44f265da630e27a7e6
        
## 三者的区别？
    MVC的V与M是可以相互通信的，
    MVP的V和M完全隔离，只通过P来链接，
    MVVM通过DataBinding实现双向绑定
## 三者的优缺点？
    MVC的VC都在activity管理之下，不容易完全解耦
    MVP的V和M完全解耦，如果业务逻辑复杂会创造大量view接口，适合工具类或者需要写很多业务逻辑的app
    MVVM不会产生大量View接口，代码简洁，但是出问题不容易定位是View层问题还是Model层问题，适合偏向展示型的app，绝大多数业务逻辑都在后端，app主要功能就是展示数据，交互等
    
## databinding实现原理？
#### 参考答案：
