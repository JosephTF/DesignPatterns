package com.joseph.lib.abstractfactory;

public class WindowsApplication implements Application{
    @Override
    public void run() {
        System.out.println("Windows application running...");
    }
}
