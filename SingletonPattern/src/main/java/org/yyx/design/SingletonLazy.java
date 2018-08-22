package org.yyx.design;

/**
 * 懒汉式单例Demo
 * <p>
 *
 * @author 叶云轩 at tdg_yyx@foxmail.com
 * @date 2018/8/22-14:59
 */
public class SingletonLazy {

    /**
     * 声明一个用于存储对象的变量
     */
    private static SingletonLazy singletonLazy;

    /**
     * 私有构造器，防止外界创建对象
     */
    private SingletonLazy() {
        System.out.println("开始创建对象,我的地址是" + toString());
    }

    /**
     * 获取实例对象的唯一入口
     *
     * @return 创建的对象
     */
    public static SingletonLazy getInstance() {
        if (singletonLazy == null) {
            singletonLazy = new SingletonLazy();
        }
        return singletonLazy;
    }

    /**
     * 打印对象信息
     */
    public void printInfo() {
        System.out.println("我是创建好的对象,我的地址为" + toString());
    }
}
