package com.gobrs.async.anno;

import com.gobrs.async.def.DefaultConfig;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author sizegang1
 * @program: gobrs-async-core
 * @author: sizegang
 * @date 2022-04-07
 * 任务注解
 **/
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Task {

    /**
     * task  name
     *
     * @return
     */
    String name() default DefaultConfig.TASKNAME;

    /**
     * Transaction task
     *
     * @return
     */
    boolean callback() default false;

    /**
     * Whether to continue executing subtasks after a task fails
     * 当子任务失败了是否执行
     * @return
     */
    boolean failSubExec() default false;

    /**
     * Retry times
     * 重试次数
     *
     * @return
     */
    int retryCount() default DefaultConfig.retryCount;

}
