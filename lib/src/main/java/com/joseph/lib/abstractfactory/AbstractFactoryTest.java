package com.joseph.lib.abstractfactory;

public class AbstractFactoryTest {
    public static void main(String[] args) {
        BaseFactory factoryWindows = new WindowsFactory();
        OperatingSystem systemWindows = factoryWindows.createOS();
        Application applicationWindows = factoryWindows.createApplication();
        systemWindows.boot();
        applicationWindows.run();

        BaseFactory factoryLinux = new LinuxFactory();
        OperatingSystem systemLinux = factoryLinux.createOS();
        Application applicationLinux = factoryLinux.createApplication();
        systemLinux.boot();
        applicationLinux.run();
    }
}
