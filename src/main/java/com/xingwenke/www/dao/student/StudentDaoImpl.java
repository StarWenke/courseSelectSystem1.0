package com.xingwenke.www.dao.student;

import com.xingwenke.www.dao.BaseDao;
import com.xingwenke.www.po.Student;


public class StudentDaoImpl extends BaseDao implements StudentDao{


    @Override
    public Student queryStudentByName(String studentName) {
        String sql = "select `student_id`, `student_name`, `student_pwd`, `major_id`, `grade_id`, `class_id` from `student` where `student_name` = ?";
        return queryForOne(Student.class, sql, studentName);
    }

    @Override
    public Student queryStudentByIdAndPwd(Integer studentId, String studentPassword) {
        String sql = "select `student_id`, `student_name`, `student_pwd`, `major_id`, `grade_id`, `class_id` from `student` where `student_id` = ? and `student_pwd`=?";
        return queryForOne(Student.class, sql,studentId, studentPassword);
    }

    @Override
    public int saveStudent(Student student) {
        String sql = "insert into student(`student_id`, `student_name`, `student_pwd`, `major_id`, `grade_id`, `class_id`)values(?,?,?,?,?,?)";
        return update(sql, student.getStudent_id(), student.getStudent_name(), student.getStudent_pwd(), student.getMajor_id(), student.getGrade_id(), student.getClass_id());
    }
}

