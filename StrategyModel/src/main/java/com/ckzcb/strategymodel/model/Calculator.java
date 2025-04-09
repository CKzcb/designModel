package com.ckzcb.strategymodel.model;

/**
 * @ClassName Calculator
 * @Description
 * @Author 蛋白质先生
 * @Date 2025/4/9 17:16
 * @Version 1.0
 */
public class Calculator {
    private OperationStrategy strategy;

    public Calculator(OperationStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(OperationStrategy strategy) {
        this.strategy = strategy;
    }

    public int executeStrategy(int num1, int num2) {
        return strategy.doOperation(num1, num2);
    }
}