package com.joseph.lib.abstractfactory;

public class LinuxSystem implements OperatingSystem{
    @Override
    public void boot() {
        System.out.println("Linux booting...");
    }
}
