package cn.zxy.aop;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Silence 000996
 * @data 17/7/24
 */
public class AopTest {
    @Test
    public void topTest(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationAopTest.xml");
        ITestBean testBean = applicationContext.getBean(ITestBean.class);
        testBean.test();
    }
}
