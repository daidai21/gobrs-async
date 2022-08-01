package com.gobrs.async.exception;

/**
 * @program: gobrs-async
 * @ClassName NotTaskRuleException
 * @description: 没有任务规则错误
 * @author: sizegang
 * @create: 2022-01-27
 * @Version 1.0
 **/
public class NotTaskRuleException extends RuntimeException {
    public NotTaskRuleException() {
        super();
    }

    public NotTaskRuleException(String message) {
        super(message);
    }

}
