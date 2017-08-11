package cn.zxy.aop.simple;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * @author Silence 000996
 * @data 17/7/25
 */
public class MyArroundAdvice implements MethodInterceptor {
    public Object invoke(MethodInvocation invocation) throws Throwable {
        System.out.println("around before");
        Object result = invocation.proceed();
        System.out.println("around after");
        return result;
    }
}
