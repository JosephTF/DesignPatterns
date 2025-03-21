package com.joseph.lib.singleton;

/**
 * Double-Checked Locking
 */
public class DoubleCheckedSingleton {
    private volatile static DoubleCheckedSingleton instance = null;

    private DoubleCheckedSingleton() {
    }

    public static DoubleCheckedSingleton getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckedSingleton.class) {
                if (instance == null) {
                    instance = new DoubleCheckedSingleton();
                }
            }
        }
        return instance;
    }

    public void doSomething() {
        System.out.println(getClass().getName() + ":do something");
    }
}
