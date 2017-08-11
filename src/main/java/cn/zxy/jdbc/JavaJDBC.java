package cn.zxy.jdbc;

import org.junit.Test;

/**
 * @author Silence 000996
 * @data 17/8/2
 */
public class JavaJDBC {
    @Test
    public void save() throws ClassNotFoundException {
        Class.forName("org.gjt.mm.mysql.Driver");
    }
}
