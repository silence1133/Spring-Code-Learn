package cn.zxy.jdbc;

import java.util.List;

/**
 * @author Silence 000996
 * @data 17/8/1
 */
public interface TestService {
    void save(TestCodeDO testCodeDO);
    List<TestCodeDO> selectAll();
}
