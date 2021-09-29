package com.xingwenke.www.dao;

import com.xingwenke.www.utils.JdbcUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public abstract class BaseDao {

    // 使用DbUtils操作数据库
    // update方法用来执行：insert、update、delete语句
    private final QueryRunner queryRunner = new QueryRunner();

    // 因为我们不知道要执行哪一个sql，所以要传入sql
    public int update(String sql, Object ... args){
        Connection connection = JdbcUtils.getConnection();

        try {
            return queryRunner.update(connection,sql,args);
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JdbcUtils.close(connection);
        }

        return -1; // 表示执行失败，返回其它的则是执行成功
    }

    // 查询返回一条javabean的sql语句
    // 下面这个是泛型Class<T> type;;; type：返回的对象类型；sql：执行的sql语句；args：SQL对应的参数值；<T>返回的类型的泛型
    public <T> T queryForOne( Class<T> type, String sql, Object ... args){
        Connection conn = JdbcUtils.getConnection();

        try {
            return queryRunner.query(conn, sql, new BeanHandler<T>(type) , args);
        } catch (SQLException e) {
            e.printStackTrace();
        }finally{
            JdbcUtils.close(conn);
        }

        return null;
    }

    // 查询返回多个javaBean的sql语句
    public <T>List<T> queryForList(Class<T> type, String sql, Object ... args){
        Connection conn = JdbcUtils.getConnection();

        try {
            // 注意：下方不是BeanHandler了，要改成BeanListHandler
            return queryRunner.query(conn, sql, new BeanListHandler<T>(type) , args);
        } catch (SQLException e) {
            e.printStackTrace();
        }finally{
            JdbcUtils.close(conn);
        }

        return null;
    }

    // 查询单个数据
    public Object queryForSingleValue(String sql, Object ... args){
        Connection conn = JdbcUtils.getConnection();

        try {
            return queryRunner.query(conn,sql,new ScalarHandler(),args);
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JdbcUtils.close(conn);
        }
        return null;
    }
}
