package com.joseph.lib.abstractfactory;

public class WindowsSystem implements OperatingSystem{
    @Override
    public void boot() {
        System.out.println("Windows booting...");
    }
}
