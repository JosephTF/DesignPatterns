package com.joseph.lib.singleton;

public class SingletonTest {

	public static void main(String[] args) {
	    EagerSingleton.getInstance().doSomething();
        LazySingleton.getInstance().doSomething();
        DoubleCheckedSingleton.getInstance().doSomething();
        StaticInnerSingleton.getInstance().doSomething();
        EnumSingleton.INSTANCE.doSomething();
	}
}
