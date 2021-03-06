# DesignPatterns
23种设计模式简单的例子。

> 源代码来自《设计模式之禅 第2版》
> 
> 看书也要动手实践，才能体会更深。实践多了，自然就会用了

## SingletonPattern 
[单例模式](./SingletonPattern/README.md)
> Ensure a class has only one instance, and provide a global point of access to it .
> 
> 单例模式是为了确保一个类只有一个实例，而且自行实例化并向整个系统提供这个实例

介绍了五种单例模式的创建方式。具体测试要自行模拟并发环境来测。

## 插播一条新闻

> 一个类的生命周期从被加载到虚拟机中开始，到卸载出内存停止，一共分为7个阶段：
> 加载 - 验证 - 准备 - 解析 - 初始化 - 使用 - 卸载。
> 详见《深入理解JAVA虚拟机 JVM高级特性与最佳实践》一书
> 
> JVM规定，有且只有5种情况会立即触发类的“初始化”操作，即：
>  1. 使用new关键字的时候、读取或设置类的静态字段（被final修饰或者已经在编译期就把结果放入常量池的静态字段除外）的时候，以及调用一个类的静态方法的时候，若类未“初始化”，则会立即触发初始化操作。
>  2. 使用java.lang.reflect包的方法对类进行反射调用时，若类没有进行过“初始化”会立即触发类的“初始化”操作。
>  3. 当一个类进行初始化的时候，如果发现该类的父类没有进行初始化，会立即触发父类的“初始化”操作。
>  4. 当JVM启动时，用户需要指定一个要执行的主类（有main方法的那个类），会立即触发类的“初始化”操作。
>  5. *<u>不明所以</u>* 当使用JDK1.7的动态语言支持时，如果一个java.lang.invoke.MethodHandle实例最后的解析结果是REF_getStatic、REF_putStatic、REF_invokeStatic的方法句柄，并且这个方法句柄对应的类没有被初始化，则会立即触发类的“初始化”操作。
> 
> 写几个例子测试一下就知道了。理解了这块知识，就知道静态内部类为什么是单例的了。

## FactoryPattern 
[工厂模式](./FactoryPattern/README.md)


## ProxyPattern
[代理模式](./ProxyPattern/README.md)