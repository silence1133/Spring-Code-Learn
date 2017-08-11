package cn.zxy.mybatis;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Silence 000996
 * @data 17/8/2
 */
public class MybatisTest {

    private SqlSessionFactory sqlSessionFactory;
    @Before
    public void before(){
        sqlSessionFactory = MybatisUtil.sqlSessionFactory;
    }

    @Test
    public void selectAll(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        TestCodeMapper testCodeMapper = sqlSession.getMapper(TestCodeMapper.class);
        System.out.println(testCodeMapper.selectAll());
    }
}
