package com.xingwenke.www.dao.student;

import com.xingwenke.www.po.Student;


public interface StudentDao {

    // 根据学生姓名查询学生信息
     Student queryStudentByName(String studentName);

    // 根据学生id和密码查询学生
     Student queryStudentByIdAndPwd(Integer studentId, String studentPassword);

    // 保存用户信息
     int saveStudent(Student student);



}
