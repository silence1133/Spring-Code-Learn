package cn.zxy.transaction;

import cn.zxy.jdbc.TestCodeDO;
import cn.zxy.mybatis.TestCodeMapper;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Silence 000996
 * @data 17/8/3
 */
public class TransactionTest {

    private TestCodeService testCodeService;
    @Before
    public void before(){
        ApplicationContext context = new ClassPathXmlApplicationContext("jdbc/application_mybatis.xml");
        testCodeService = (TestCodeService) context.getBean("testCodeService");
    }

    @Test
    public void testInsert(){
        TestCodeDO temp = new TestCodeDO("test","test");
        testCodeService.insert(temp);
    }
}
