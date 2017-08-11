package cn.zxy.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.util.List;

/**
 * @author Silence 000996
 * @data 17/8/1
 */
@Component
public class TestServiceImpl implements TestService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void save(TestCodeDO testCodeDO) {
        String insertSql = "insert into testcode(content,media) values (?,?);";
        jdbcTemplate.update(insertSql,testCodeDO.getContent(),testCodeDO.getMedia());
    }

    public List<TestCodeDO> selectAll() {
        return jdbcTemplate.query("select * from testcode",new TestCodeMapper());
    }
}
