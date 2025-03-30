package com.ckzcb.simplefactory.model;

/**
 * @ClassName OperationSub
 * @Description
 * @Author 蛋白质先生
 * @Date 2025/3/30 17:24
 * @Version 1.0
 */
public class OperationSub<T extends Number> extends Operation<T> {

    @Override
    public T getResult() {
        try {
            Class<?> clazz = numberA.getClass();
            if (clazz == Integer.class) {
                int result = numberA.intValue() - numberB.intValue();
                return (T) Integer.valueOf(result);
            } else if (clazz == Double.class) {
                double result = numberA.doubleValue() - numberB.doubleValue();
                return (T) Double.valueOf(result);
            }
        } catch (Exception e) {
            throw new RuntimeException("计算结果时出错", e);
        }
        return null;
    }
}
