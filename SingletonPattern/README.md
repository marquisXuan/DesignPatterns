#SingletonPattern - 单例模式

> Ensure a class has only one instance, and provide a global point of access to it .
> 
> 单例模式是为了确保一个类只有一个实例，而且自行实例化并向整个系统提供这个实例
> 
> -----引自《设计模式之禅》

## 饿汉式单例模式的实现

#### 饿汉式单例模式Demo

- 参见 SingletonHungry

## 懒汉式单例模式的实现

#### 懒汉式单例模式Demo

- 参见 SingletonLazy
- 该Demo不适用于高开发的情况。

#### 较为安全的懒汉式单例模式Demo

- 参见 SingletonLazyMoreSafe
- 该Demo虽然做到了线程安全，但并不高效，而且也不是绝对的线程安全。

#### 双重锁检查的懒汉单例模式Demo

- 参见 SingletonLazyDoubleLockCheck

## 静态内部类的单例模式的实现

#### 静态内部类的单例模式Demo

- 参见 SingletonLazyInnerClass
- 使用static来修饰一个内部类，则这个内部类就属于外部类本身，而不属于外部类的某个对象。即与类相关，不与实例对象相关。
- 可以避免反射入侵
- 由于静态内部类的特性，只有在其被第一次引用的时候才会被加载，所以可以保证其线程安全性。具体说明详见类加载机制。

