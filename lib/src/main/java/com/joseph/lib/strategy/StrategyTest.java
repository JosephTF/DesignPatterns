package com.joseph.lib.strategy;

public class StrategyTest {
    public static void main(String[] args) {
        double paramA = 5;
        double paramB = 21;
        System.out.println("------------- Normal Calc ----------------");
        System.out.println("Add Test:" + NormalCalc.calc("+", paramA, paramB));
        System.out.println("Sub Test:" + NormalCalc.calc("-", paramA, paramB));
        System.out.println("Multi Test:" + NormalCalc.calc("*", paramA, paramB));
        System.out.println("Div Test:" + NormalCalc.calc("/", paramA, paramB));

        System.out.println("------------ Strategy Test  ----------------");
        StrategyCalc.getInstance().setStrategy(new AddStrategy());
        System.out.println("Add Test:" + StrategyCalc.calc(paramA, paramB));
        StrategyCalc.getInstance().setStrategy(new SubStrategy());
        System.out.println("Sub Test:" + StrategyCalc.calc(paramA, paramB));
        StrategyCalc.getInstance().setStrategy(new MultiStrategy());
        System.out.println("Multi Test:" + StrategyCalc.calc(paramA, paramB));
        StrategyCalc.getInstance().setStrategy(new DivStrategy());
        System.out.println("Div Test:" + StrategyCalc.calc(paramA, paramB));
    }
}
