package com.gobrs.async.domain;

/**
 * @program: gobrs-async-starter
 * @ClassName AsyncParam
 * @description: 任务参数
 * @author: sizegang
 * @create: 2022-03-20
 **/
@FunctionalInterface
public interface AsyncParam<T> {
    T get();
}
