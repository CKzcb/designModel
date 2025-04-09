package com.ckzcb.strategymodel;


import com.ckzcb.strategymodel.model.*;

/**
 * @ClassName StrategyModelMain
 * @Description
 * @Author 蛋白质先生
 * @Date 2025/3/30 17:47
 * @Version 1.0
 */
public class StrategyModelMain {
    public static void main(String[] args) {
        // 创建加法策略
        OperationStrategy addition = new AdditionStrategy();
        Calculator calculator = new Calculator(addition);
        int result = calculator.executeStrategy(5, 3);
        System.out.println("5 + 3 = " + result);

        // 切换到减法策略
        OperationStrategy subtraction = new SubtractionStrategy();
        calculator.setStrategy(subtraction);
        result = calculator.executeStrategy(5, 3);
        System.out.println("5 - 3 = " + result);

        // 切换到乘法策略
        OperationStrategy multiplication = new MultiplicationStrategy();
        calculator.setStrategy(multiplication);
        result = calculator.executeStrategy(5, 3);
        System.out.println("5 * 3 = " + result);
    }
}
