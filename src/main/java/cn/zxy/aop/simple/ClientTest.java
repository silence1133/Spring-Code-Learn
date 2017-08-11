package cn.zxy.aop.simple;

import org.junit.Test;
import org.springframework.aop.framework.ProxyFactory;

/**
 * @author Silence 000996
 * @data 17/7/25
 */
public class ClientTest {
    @Test
    public void beforeAdviceTest(){
        ProxyFactory proxyFactory = new ProxyFactory();
        proxyFactory.setTarget(new Person());
        proxyFactory.addAdvice(new MyBeforeAdvice());

        Person person = (Person) proxyFactory.getProxy();
        person.say("hello");

    }

    @Test
    public void afterAdviceTest(){
        ProxyFactory proxyFactory = new ProxyFactory();
        proxyFactory.setTarget(new Person());
        proxyFactory.addAdvice(new MyAfterAdvice());

        Person person = (Person) proxyFactory.getProxy();
        person.say("hello");
    }

    @Test
    public void aroundAdviceTest(){
        ProxyFactory proxyFactory = new ProxyFactory();
        proxyFactory.setTarget(new Person());
        proxyFactory.addAdvice(new MyArroundAdvice());

        Person person = (Person) proxyFactory.getProxy();
        person.say("hello");
    }

    @Test
    public void throwAdviceTest(){
        ProxyFactory proxyFactory = new ProxyFactory();
        proxyFactory.setTarget(new Person());
        proxyFactory.addAdvice(new MyThrowAdvice());

        Person person = (Person) proxyFactory.getProxy();
        person.sayException("hello");
    }


    @Test
    public void introductionTest(){
        ProxyFactory proxyFactory = new ProxyFactory();
        proxyFactory.setTarget(new Person());
        proxyFactory.addAdvice(new MyIntroductionAdvice());
        proxyFactory.setInterfaces(ITest.class);

        ITest test = (ITest) proxyFactory.getProxy();
        test.test();
    }
}
