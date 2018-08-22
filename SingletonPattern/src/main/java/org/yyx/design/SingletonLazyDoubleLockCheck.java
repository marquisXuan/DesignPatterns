package org.yyx.design;

/**
 * 双重锁检查的懒汉式单例模式
 * <p>
 *
 * @author 叶云轩 at tdg_yyx@foxmail.com
 * @date 2018/8/22-15:41
 */
public class SingletonLazyDoubleLockCheck {
    /**
     * 私有构造
     */
    private SingletonLazyDoubleLockCheck() {
        System.out.println("开始创建对象,我的地址是" + toString());
    }

    /**
     * 声明一个用于存储对象的变量
     */
    public volatile static SingletonLazyDoubleLockCheck singletonLazyDoubleLockCheck;

    /**
     * 获取实例对象的唯一入口
     *
     * @return 创建的对象
     */
    public static SingletonLazyDoubleLockCheck getInstance() {
        if (singletonLazyDoubleLockCheck == null) {
            synchronized (SingletonLazyDoubleLockCheck.class) {
                if (singletonLazyDoubleLockCheck == null) {
                    singletonLazyDoubleLockCheck = new SingletonLazyDoubleLockCheck();
                }
            }
        }
        return singletonLazyDoubleLockCheck;
    }

    /**
     * 打印类信息
     */
    public void printInfo() {
        System.out.println("我是先前就创建好的对象，我的地址是" + toString());
    }

}
