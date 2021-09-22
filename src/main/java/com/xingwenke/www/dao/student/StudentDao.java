package com.xingwenke.www.dao.student;

import com.xingwenke.www.po.Student;

import java.sql.Connection;

public interface StudentDao {

    //得到要登录的学生
    public Student getLoginStudent(Connection connection, Integer studentId);

}
