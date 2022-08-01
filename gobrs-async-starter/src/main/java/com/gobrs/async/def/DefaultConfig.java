package com.gobrs.async.def;

/**
 * @author : wh
 * @date : 2022/6/1 11:39
 * @description:
 */
public interface DefaultConfig {

    String TASKNAME = "asyncTaskName";

    Integer THREADPOOLQUEUESIZE = 10000;

    Long KEEPALIVETIME = 30000L;

    Long EXECUTETIMEOUT = 10000L;

    String RULE_ANY = "any"; // 任何
    String RULE_EXCLUSIVE = "exclusive"; // 专业

    int retryCount = 1;
    /**
     * Whether to execute a subtask if it fails
     * 如果子任务失败，是否执行该子任务
     */
    boolean failSubExec = false;
    /**
     * Transaction task
     * 是否是事务任务
     */
    boolean transaction = false;


}
