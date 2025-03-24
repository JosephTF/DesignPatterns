package com.joseph.lib.strategy;

public class SubStrategy implements IStrategy{
    @Override
    public double calc(double paramA, double paramB) {
        return paramA-paramB;
    }
}
