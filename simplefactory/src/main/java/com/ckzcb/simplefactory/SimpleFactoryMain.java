package com.ckzcb.simplefactory;

import com.ckzcb.simplefactory.model.Operation;
import com.ckzcb.simplefactory.service.SimpleFactory;

/**
 * @ClassName SimpleFactoryMain
 * @Description 简单工厂模式
 * SimpleFactory类：工厂类，创建产品实例
 * Operation基类，封装了运算方法
 * OperationAdd、OperationSubtract、OperationMultiply、OperationDivide继承Operation基类，实现了运算方法
 * @Author 蛋白质先生
 * @Date 2025/3/30 16:37
 * @Version 1.0
 */
public class SimpleFactoryMain {
    public static void main(String[] args) {
        Operation<Integer> operation = SimpleFactory.getOperation("*");
        assert operation != null;
        operation.setNumberA(1);
        operation.setNumberB(2);
        System.out.println(operation.getResult());
    }
}
