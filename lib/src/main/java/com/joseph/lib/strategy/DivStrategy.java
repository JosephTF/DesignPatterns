package com.joseph.lib.strategy;

public class DivStrategy implements IStrategy {
    @Override
    public double calc(double paramA, double paramB) {
        if (paramB != 0) {
            return paramA / paramB;
        } else {
            throw new IllegalArgumentException("除数不能为0");
        }
    }
}
