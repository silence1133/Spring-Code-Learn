package cn.zxy.mybatis;

import cn.zxy.jdbc.TestCodeDO;

import java.util.List;

/**
 * @author Silence 000996
 * @data 17/8/2
 */
public interface TestCodeMapper {
    List<TestCodeDO> selectAll();
    int insert(TestCodeDO testCodeDO);
}
