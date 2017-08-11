package cn.zxy.transaction;

import cn.zxy.jdbc.TestCodeDO;
import cn.zxy.mybatis.TestCodeMapper;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Silence 000996
 * @data 17/8/3
 */
public class TestCodeServiceImpl implements TestCodeService {
    private TestCodeMapper testCodeMapper;
    @Transactional
    public void insert(TestCodeDO testCodeDO) {
        testCodeMapper.insert(testCodeDO);
        throw new RuntimeException();
    }

    public void setTestCodeMapper(TestCodeMapper testCodeMapper) {
        this.testCodeMapper = testCodeMapper;
    }
}
