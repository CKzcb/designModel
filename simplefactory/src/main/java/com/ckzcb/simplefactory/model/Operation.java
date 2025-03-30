package com.ckzcb.simplefactory.model;

import lombok.Getter;
import lombok.Setter;

/**
 * @ClassName Operation
 * @Description
 * @Author 蛋白质先生
 * @Date 2025/3/30 16:52
 * @Version 1.0
 */
@Getter
@Setter
public abstract class Operation<T extends Number> {
    protected T numberA;
    protected T numberB;


    public abstract T getResult();
}
