package com.xingwenke.www.test;

import com.xingwenke.www.utils.JdbcUtils;
import org.junit.Test;

import java.sql.Connection;

public class JdbcUtilsTest {

    @Test
    public void testJdbcUtils(){
        System.out.println(JdbcUtils.getConnection());
    }

    @Test
    public void testMaxActive(){
        for (int i = 0; i < 100; i++) {
            System.out.println(JdbcUtils.getConnection());
        }
    }
    @Test
    public void testClose(){
        for (int i = 0; i < 100; i++) {
            Connection connection = JdbcUtils.getConnection();
            System.out.println(connection);
            JdbcUtils.close(connection);
        }
    }

}
