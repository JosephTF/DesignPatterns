package com.joseph.lib.abstractfactory;

public class LinuxApplication implements Application{
    @Override
    public void run() {
        System.out.println("Linux application running...");
    }
}
