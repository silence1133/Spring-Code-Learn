package cn.zxy.aop.simple;

import org.springframework.aop.ThrowsAdvice;

import java.lang.reflect.Method;

/**
 * @author Silence 000996
 * @data 17/7/25
 * ThrowsAdvice没有提供需要实现的方法，但实际是需要按照规定方法名称和参数写方法，可以看ThrowsAdvice注释。
 */
public class MyThrowAdvice implements ThrowsAdvice {
    public void afterThrowing(Method method, Object[] args, Object target, Exception e) {
        System.out.println("---------- Throw Exception ----------");
        System.out.println("Target Class: " + target.getClass().getName());
        System.out.println("Method Name: " + method.getName());
        System.out.println("Exception Message: " + e.getMessage());
        System.out.println("-------------------------------------");
    }
}
