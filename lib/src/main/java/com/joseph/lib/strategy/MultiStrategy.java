package com.joseph.lib.strategy;

public class MultiStrategy implements IStrategy {
    @Override
    public double calc(double paramA, double paramB) {
        return paramA * paramB;
    }
}
