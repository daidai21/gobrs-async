package com.gobrs.async.autoconfig;


import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import com.gobrs.async.rule.Rule;

/**
 * @author sizegang1
 * @program: gobrs
 * @ClassName BootstrapProperties
 * @description: 框架属性加载
 * @author: sizegang
 * @create: 2022-01-08 17:30
 * @Version 1.0
 * @date 2022-01-27 22:04
 **/
@ConfigurationProperties(prefix = GobrsAsyncProperties.PREFIX)
@Component
public class GobrsAsyncProperties {

    public static final String PREFIX = "spring.gobrs.async";

    /**
     * Task rules
     */
    private List<Rule> rules;

    /**
     * Task separator
     */
    private String split = ";";

    /**
     * Next task
     */
    private String point = "->";


    /**
     * Whether the execution exception interrupts the workflow
     * 执行异常是否中断工作流
     */
    private boolean taskInterrupt = false;


    /**
     * Whether global parameter dataContext mode  Parameter context
     * 是否全局参数dataContext模式参数context
     */
    private boolean paramContext = true;

    /**
     * Whether transaction task
     * 是否是事务任务
     */
    private boolean transaction = false;

    /**
     * Default timeout
     * 默认超时时间
     * @return
     */
    private long timeout = 3000;

    // TODO
    private boolean relyDepend = false;


    public long getTimeout() {
        return timeout;
    }

    public void setTimeout(long timeout) {
        this.timeout = timeout;
    }

    public String getSplit() {

        return split;
    }

    public void setSplit(String split) {
        this.split = split;
    }

    public String getPoint() {
        return point;
    }

    public void setPoint(String point) {
        this.point = point;
    }


    public List<Rule> getRules() {
        return rules;
    }

    public void setRules(List<Rule> rules) {
        this.rules = rules;
    }

    public boolean isTaskInterrupt() {
        return taskInterrupt;
    }

    public void setTaskInterrupt(boolean taskInterrupt) {
        this.taskInterrupt = taskInterrupt;
    }

    public boolean isRelyDepend() {
        return relyDepend;
    }

    public void setRelyDepend(boolean relyDepend) {
        this.relyDepend = relyDepend;
    }


    public boolean isParamContext() {
        return paramContext;
    }

    public void setParamContext(boolean paramContext) {
        this.paramContext = paramContext;
    }

    public boolean isTransaction() {
        return transaction;
    }

    public void setTransaction(boolean transaction) {
        this.transaction = transaction;
    }
}
