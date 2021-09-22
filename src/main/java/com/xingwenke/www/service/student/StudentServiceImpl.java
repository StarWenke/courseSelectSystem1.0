package com.xingwenke.www.service.student;

import com.xingwenke.www.dao.BaseDao;
import com.xingwenke.www.dao.student.StudentDao;
import com.xingwenke.www.dao.student.StudentDaoImpl;
import com.xingwenke.www.po.Student;
import org.junit.Test;

import java.sql.Connection;
import java.sql.SQLException;

public class StudentServiceImpl implements StudentService{

    // 业务层调用dao层
    private StudentDao studentDao;
    // 将studentService实例化
    public StudentServiceImpl(){
        studentDao = new StudentDaoImpl();
    }

    @Override
    public Student login(Integer studentId, String studentPwd) {
        Connection connection = null;
        Student student = null;

        connection = BaseDao.getConnection();
        student = studentDao.getLoginStudent(connection ,studentId);
        BaseDao.closeResource(connection,null,null);

        return student;
    }

    @Test
    public void loginTest(){
        StudentServiceImpl studentService = new StudentServiceImpl();
        Student student = studentService.login(11,"xing123");
        System.out.println(student.getStudentPwd());
    }
}
