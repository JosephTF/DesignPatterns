package com.joseph.lib.singleton;

/**
 * Eager Initialization
 */
public class EagerSingleton {
    private static final EagerSingleton instance = new EagerSingleton();

    private EagerSingleton() {
    }

    public static EagerSingleton getInstance() {
        return instance;
    }

    public void doSomething() {
        System.out.println(getClass().getName() + ":do something");
    }
}
