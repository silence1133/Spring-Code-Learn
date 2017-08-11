package cn.zxy.jdbc;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Silence 000996
 * @data 17/8/2
 */
public class MainTest {
    private TestService testService;

/*    @Before
    public void before() {
        ApplicationContext context = new ClassPathXmlApplicationContext("jdbc/applicationJdbc.xml");
        testService = context.getBean(TestServiceImpl.class);
    }*/

    @Before
    public void before() {
        ApplicationContext context = new AnnotationConfigApplicationContext(MainConfiguration.class);
        testService = context.getBean(TestServiceImpl.class);
    }

    @Test
    public void save() {
        TestCodeDO testCodeDO = new TestCodeDO("content", "media");
        testService.save(testCodeDO);
    }

    @Test
    public void selectAll() {
        System.out.println(testService.selectAll());
    }
}
