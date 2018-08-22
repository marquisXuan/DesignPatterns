package org.yyx.design;

import org.junit.Test;


public class SingletonHungryTest {

    /**
     * 测试饿汉式单例模式
     */
    @Test
    public void printInfo() {
        for (int i = 0; i < 4; i++) {
            SingletonHungry.getInstance().printInfo();
        }
    }
}