package org.yyx.design;

/**
 * 静态内部类单例模式
 * <p>
 *
 * @author 叶云轩 at tdg_yyx@foxmail.com
 * @date 2018/8/22-15:47
 */
public class SingletonInnerClass {
    /**
     * 私有构造
     */
    private SingletonInnerClass() {
        System.out.println("开始创建对象,我的地址是" + toString());
    }

    /**
     * 获取实例对象的唯一入口
     *
     * @return 创建的对象
     */
    public static SingletonInnerClass getInstance() {
        return SingletonLazyInnerHolder.SINGLETON_LAZY_INNER_CLASS;
    }

    /**
     * 打印类信息
     */
    public void printInfo() {
        System.out.println("我是先前就创建好的对象，我的地址是" + toString());
    }

    /**
     * 静态内部类
     */
    private static class SingletonLazyInnerHolder {
        private static final SingletonInnerClass SINGLETON_LAZY_INNER_CLASS = new SingletonInnerClass();
    }

}
