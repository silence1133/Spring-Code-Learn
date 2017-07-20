package cn.zxy.applicationContext;

import cn.zxy.applicationContext.event.ApplicationEventTest;
import cn.zxy.bean.BeanTest;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Locale;

/**
 * @author Silence 000996
 * @data 17/7/19
 */

public class ApplicationContextTest {

    @Test
    public void xmlClassPath() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationTest.xml");
        BeanTest beanTest = context.getBean(BeanTest.class);
    }

    @Test
    public void messageTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationTest.xml");
        Object[] param = new Object[]{"Silence"};
        String message = context.getMessage("userinfo", param, Locale.CHINA);
        System.out.println(message);
    }

    @Test
    public void eventTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationTest.xml");
        context.publishEvent(new ApplicationEventTest("test"));
    }
}
