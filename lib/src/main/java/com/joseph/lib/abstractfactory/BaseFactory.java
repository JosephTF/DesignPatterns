package com.joseph.lib.abstractfactory;

public interface BaseFactory {
    OperatingSystem createOS();
    Application createApplication();
}
