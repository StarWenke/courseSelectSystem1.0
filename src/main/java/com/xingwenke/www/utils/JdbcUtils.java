package com.xingwenke.www.utils;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidDataSourceFactory;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

public class JdbcUtils {

    private static DruidDataSource dataSource;
//    private static ComboPooledDataSource ds = new ComboPooledDataSource();
//    public static DataSource getDataSource(){
//        return ds;
//    }

    static{
        try{
            Properties properties = new Properties();
            // 读取jdbc.properties的属性配置文件
            InputStream resourceAsStream = JdbcUtils.class.getClassLoader().getResourceAsStream("db.properties");
            // 从流中加载数据
            properties.load(resourceAsStream);
            // 创建数据库连接池
            dataSource = (DruidDataSource) DruidDataSourceFactory.createDataSource(properties);

    }catch(Exception e){
        e.printStackTrace();
    }
}



    // 获取数据库连接池中的内容; 如果返回null那么就是失败了，
    public static Connection getConnection(){

        Connection conn = null;
        try {
            conn = dataSource.getConnection();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }
    // 关闭连接，放回数据库连接池
    public static void close(Connection conn){
        if(conn != null){
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

}
