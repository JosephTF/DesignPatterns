package com.joseph.lib.singleton;

/**
 * Enum
 */
public enum EnumSingleton {
    INSTANCE;

    public void doSomething() {
        System.out.println(getClass().getName() + ":do something");
    }
}
