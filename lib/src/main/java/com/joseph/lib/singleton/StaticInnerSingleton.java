package com.joseph.lib.singleton;

/**
 * Static Inner Class
 */
public class StaticInnerSingleton {
    private StaticInnerSingleton() {
    }

    private static class InnerClass {
        private static final StaticInnerSingleton instance = new StaticInnerSingleton();
    }

    public static StaticInnerSingleton getInstance() {
        return InnerClass.instance;
    }

    public void doSomething() {
        System.out.println(getClass().getName() + ":do something");
    }
}
