package com.gobrs.async.callback;

/**
 * @program: gobrs-async-core
 * @ClassName PostPostInterceptor 任务后拦截器
 * @description:
 * @author: sizegang
 * @create: 2022-03-23
 **/
public interface AsyncTaskPostInterceptor {

   /**
    *
    * @param result task result
    * @param taskName taskName
    */
   void postProcess(Object result,  String taskName);

}
