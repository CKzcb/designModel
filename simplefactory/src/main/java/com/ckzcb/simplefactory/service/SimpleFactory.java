package com.ckzcb.simplefactory.service;

import com.ckzcb.simplefactory.model.Operation;
import com.ckzcb.simplefactory.model.OperationAdd;
import com.ckzcb.simplefactory.model.OperationMul;
import com.ckzcb.simplefactory.model.OperationSub;

/**
 * @ClassName SimpleFactory
 * @Description
 * @Author 蛋白质先生
 * @Date 2025/3/30 16:52
 * @Version 1.0
 */
public class SimpleFactory {

    public static <T extends Number> Operation<T> getOperation(String operate) {
        return switch (operate) {
            case "+" -> new OperationAdd<T>();
            case "-" -> new OperationSub<T>();
            case "*" -> new OperationMul<T>();
            default -> null;
        };
    }

}
