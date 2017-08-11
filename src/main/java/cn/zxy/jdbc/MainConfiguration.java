package cn.zxy.jdbc;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

/**
 * @author Silence 000996
 * @data 17/8/2
 */
@Configuration
@ComponentScan(value = "cn.zxy.jdbc")
public class MainConfiguration {

    @Bean
    JdbcTemplate jdbcTemplate() {
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setDriverClassName("org.gjt.mm.mysql.Driver");
        dataSource.setUrl("jdbc:mysql://10.202.6.64:3306/consumer_app");
        dataSource.setUsername("consumer_app");
        dataSource.setPassword("fcapp123!");
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
        return jdbcTemplate;
    }
}
