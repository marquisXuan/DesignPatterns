package org.yyx.design;

import org.junit.Test;

public class SingletonLazyTest {

    /**
     * 测试懒汉式单例模式
     */
    @Test
    public void printInfo() {
        for (int i = 0; i < 4; i++) {
            SingletonLazy.getInstance().printInfo();
        }
    }

    /**
     * 测试较为安全的懒汉式单例模式
     * 当然要在高并发的情况下进行测试
     * 自己制造环境去-。- 我不管
     */
    @Test
    public void printInfoMoreSafe() {
        Thread thread = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                SingletonLazyMoreSafe.getInstance().printInfo();
            }
        });
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                SingletonLazyMoreSafe.getInstance().printInfo();
            }
        });
        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                SingletonLazyMoreSafe.getInstance().printInfo();
            }
        });
        Thread thread3 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                SingletonLazyMoreSafe.getInstance().printInfo();
            }
        });
        Thread thread4 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                SingletonLazyMoreSafe.getInstance().printInfo();
            }
        });
        thread.start();
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }


    /**
     * 测试双重锁检查的懒汉式单例模式
     * 当然要在高并发的情况下进行测试
     * 自己制造环境去-。- 我不管
     */
    @Test
    public void printInfoDoubleLockCheck() {
        Thread thread = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                SingletonLazyDoubleLockCheck.getInstance().printInfo();
            }
        });
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                SingletonLazyDoubleLockCheck.getInstance().printInfo();
            }
        });
        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                SingletonLazyDoubleLockCheck.getInstance().printInfo();
            }
        });
        Thread thread3 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                SingletonLazyDoubleLockCheck.getInstance().printInfo();
            }
        });
        Thread thread4 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                SingletonLazyDoubleLockCheck.getInstance().printInfo();
            }
        });
        thread.start();
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }


    /**
     * 测试静态内部类的懒汉式单例模式
     * 当然要在高并发的情况下进行测试
     * 自己制造环境去-。- 我不管
     */
    @Test
    public void printInfoInnerClass() {
        Thread thread = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                SingletonInnerClass.getInstance().printInfo();
            }
        });
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                SingletonInnerClass.getInstance().printInfo();
            }
        });
        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                SingletonInnerClass.getInstance().printInfo();
            }
        });
        Thread thread3 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                SingletonInnerClass.getInstance().printInfo();
            }
        });
        Thread thread4 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                SingletonInnerClass.getInstance().printInfo();
            }
        });
        thread.start();
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }
}