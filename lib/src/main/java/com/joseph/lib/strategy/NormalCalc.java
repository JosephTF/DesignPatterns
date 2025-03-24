package com.joseph.lib.strategy;

public class NormalCalc {
    public static double calc(String op, double paramA, double paramB) {
        if ("+".equals(op)) {
            return paramA + paramB;
        } else if ("-".equals(op)) {
            return paramA - paramB;
        } else if ("*".equals(op)) {
            return paramA * paramB;
        } else if ("/".equals(op)) {
            if (paramB == 0) {
                throw new IllegalArgumentException("除数不能为0!");
            }
            return paramA / paramB;
        } else {
            throw new IllegalArgumentException("未找到计算方法!");
        }
    }
}
