package com.ckzcb.simplefactory.model;

/**
 * @ClassName OperationAdd
 * @Description
 * @Author 蛋白质先生
 * @Date 2025/3/30 16:53
 * @Version 1.0
 */
public class OperationAdd<T extends Number> extends Operation<T> {

    @Override
    public T getResult() {
        try {
            Class<?> clazz = numberA.getClass();
            if (clazz == Integer.class) {
                int result = numberA.intValue() + numberB.intValue();
                return (T) Integer.valueOf(result);
            } else if (clazz == Double.class) {
                double result = numberA.doubleValue() + numberB.doubleValue();
                return (T) Double.valueOf(result);
            } else {
                // 可以根据需要添加更多的数值类型处理逻辑
                throw new UnsupportedOperationException("不支持的数值类型: " + clazz.getName());
            }
        } catch (Exception e) {
            throw new RuntimeException("计算结果时出错", e);
        }
    }
}
