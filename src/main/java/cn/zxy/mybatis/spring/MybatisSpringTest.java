package cn.zxy.mybatis.spring;

import cn.zxy.mybatis.TestCodeMapper;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Silence 000996
 * @data 17/8/3
 */
public class MybatisSpringTest {
    private TestCodeMapper testCodeMapper;
    @Before
    public void before(){
        ApplicationContext context = new ClassPathXmlApplicationContext("jdbc/application_mybatis.xml");
        testCodeMapper = (TestCodeMapper) context.getBean("testCodeMapper");
    }

    @Test
    public void testSelect(){
        System.out.println(testCodeMapper.selectAll());
    }
}
