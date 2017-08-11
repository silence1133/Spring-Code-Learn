package cn.zxy.aop.simple;

import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.support.DelegatingIntroductionInterceptor;

/**
 * @author Silence 000996
 * @data 17/7/25
 */
public class MyIntroductionAdvice extends DelegatingIntroductionInterceptor implements ITest {
    public void test() {
        System.out.println("itest test");
    }

    @Override
    public Object invoke(MethodInvocation mi) throws Throwable {
        return super.invoke(mi);
    }
}
