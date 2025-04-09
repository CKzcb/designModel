package com.ckzcb.strategymodel.model;

/**
 * @ClassName AdditionStrategy
 * @Description
 * @Author 蛋白质先生
 * @Date 2025/4/9 17:19
 * @Version 1.0
 */
public class AdditionStrategy implements OperationStrategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 + num2;
    }
}
