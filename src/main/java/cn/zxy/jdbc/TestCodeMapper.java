package cn.zxy.jdbc;


import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author Silence 000996
 * @data 17/8/1
 */
public class TestCodeMapper implements RowMapper {

    public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
        TestCodeDO testCodeDO = new TestCodeDO(rs.getLong("id"),rs.getString("content"),rs.getString("media"));
        return testCodeDO;
    }
}
