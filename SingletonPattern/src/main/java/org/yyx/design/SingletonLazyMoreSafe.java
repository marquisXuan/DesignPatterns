package org.yyx.design;

/**
 * 懒汉模式较为安全的一种写法
 * <p>
 *
 * @author 叶云轩 at tdg_yyx@foxmail.com
 * @date 2018/8/22-15:27
 */
public class SingletonLazyMoreSafe {

    /**
     * 私有构造
     */
    private SingletonLazyMoreSafe() {
        System.out.println("开始创建对象,我的地址是" + toString());
    }

    /**
     * 声明一个用于存储对象的变量
     */
    private static SingletonLazyMoreSafe singletonLazyMoreSafe;

    /**
     * 获取实例对象的唯一入口
     *
     * @return 创建的对象
     */
    public static synchronized SingletonLazyMoreSafe getInstance() {
        if (singletonLazyMoreSafe == null) {
            singletonLazyMoreSafe = new SingletonLazyMoreSafe();
        }
        return singletonLazyMoreSafe;
    }

    /**
     * 打印类信息
     */
    public void printInfo() {
        System.out.println("我是先前就创建好的对象，我的地址是" + toString());
    }
}
