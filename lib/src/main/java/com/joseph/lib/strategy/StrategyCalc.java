package com.joseph.lib.strategy;

public class StrategyCalc {
    private static class StrategyCalcInner {
        private static StrategyCalc instance = new StrategyCalc();
    }

    public static StrategyCalc getInstance() {
        return StrategyCalcInner.instance;
    }
    private IStrategy strategy;

    public void setStrategy(IStrategy strategy) {
        this.strategy = strategy;
    }

    double calcInner(double paramA, double paramB) {
        if (strategy == null) {
            return 0;
        }
        return strategy.calc(paramA, paramB);
    }

    public static double calc(double paramA, double paramB) {
        return getInstance().calcInner(paramA, paramB);
    }
}
