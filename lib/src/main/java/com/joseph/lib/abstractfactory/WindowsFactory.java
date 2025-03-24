package com.joseph.lib.abstractfactory;

public class WindowsFactory implements BaseFactory{
    @Override
    public OperatingSystem createOS() {
        return new WindowsSystem();
    }

    @Override
    public Application createApplication() {
        return new WindowsApplication();
    }
}
