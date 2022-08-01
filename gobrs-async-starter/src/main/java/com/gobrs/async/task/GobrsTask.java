package com.gobrs.async.task;

import com.gobrs.async.TaskSupport;

/**
 * @program: gobrs-async-core
 * @description: 任务模板
 * @author: sizegang
 * @create: 2022-03-23 23:31
 **/
public interface GobrsTask<Param, Result> extends Task {
    /**
     * Before the mission begins
     * 在任务开始之前
     *
     * @param param
     */
    void prepare(Param param);

    /**
     * Tasks to be performed
     * 要执行的任务
     *
     * @param param
     * @return
     */
    Result task(Param param, TaskSupport support);

    /**
     * Whether a task needs to be executed
     * 是否需要执行任务
     *
     * @param param
     * @return
     */
    boolean nessary(Param param, TaskSupport support);

    /**
     * Task Executed Successfully
     *
     * @param support
     */
    void onSuccess(TaskSupport support);

    /**
     * Task execution failure
     *
     * @param support
     */
    void onFail(TaskSupport support);

    /**
     * rollback
     */
    // TODO: 事务任务失败的时候用的？
    default void rollback(Param param) {

    }
}
