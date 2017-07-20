package cn.zxy.bean;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

/**
 * @author Silence 000996
 * @data 17/7/12
 */
public class BeanFactoryTest {
    public static void main(String[] args) {
        BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("applicationTest.xml"));
        BeanTest beanTest = (BeanTest) beanFactory.getBean("beanTest");
//        BeanTest beanTest2 = (BeanTest) beanFactory.getBean("beanTest");

    }
}
