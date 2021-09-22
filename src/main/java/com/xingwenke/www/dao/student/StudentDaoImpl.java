package com.xingwenke.www.dao.student;

import com.xingwenke.www.dao.BaseDao;
import com.xingwenke.www.po.Student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class StudentDaoImpl implements StudentDao{

    // 得到学生登录的实现类
    @Override
    public Student getLoginStudent(Connection connection, Integer studentId) {

        PreparedStatement pstm = null;
        ResultSet rs = null;
        Student student = null;

        if (connection != null) {
            String sql = "select * from student where `student_id` = ?";
            Object[] params = {studentId};

            try {
                rs = BaseDao.execute(connection, sql, params,rs, pstm);

                if (rs.next()){
                    student = new Student();
                    student.setStudentId(rs.getInt("student_id"));
                    student.setStudentName(rs.getString("student_name"));
                    student.setStudentPwd(rs.getString("student_pwd"));
                    student.setClassId(rs.getInt("class_id"));
                    student.setGradeId(rs.getInt("grade_id"));
                    student.setMajorId(rs.getInt("major_id"));
                }
                BaseDao.closeResource(null,pstm,rs);
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
        return student;
    }
}
