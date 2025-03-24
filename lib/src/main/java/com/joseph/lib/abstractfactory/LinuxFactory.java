package com.joseph.lib.abstractfactory;

public class LinuxFactory implements BaseFactory{
    @Override
    public OperatingSystem createOS() {
        return new LinuxSystem();
    }

    @Override
    public Application createApplication() {
        return new LinuxApplication();
    }
}
