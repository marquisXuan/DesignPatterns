package org.yyx.design;

/**
 * 饿汉式单例模式
 * <p>
 *
 * @author 叶云轩 at tdg_yyx@foxmail.com
 * @date 2018/8/22-14:02
 */
public class SingletonHungry {

    /**
     * 私有构造器，避免new对象
     */
    private SingletonHungry() {
        System.out.println("开始创建对象,我的地址是" + toString());
    }

    /**
     * 准备好一个对象,在类加载时创建对象
     */
    private static final SingletonHungry SINGLETON_HUNGRY = new SingletonHungry();

    /**
     * 唯一获取对象的方法
     *
     * @return 饿汉式创建的对象
     */
    public static SingletonHungry getInstance() {
        return SINGLETON_HUNGRY;
    }

    /**
     * 打印类信息
     */
    public void printInfo() {
        System.out.println("我是先前就创建好的对象，我的地址是" + toString());
    }
}