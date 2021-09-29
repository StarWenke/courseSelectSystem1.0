package com.xingwenke.www.service.student;

import com.xingwenke.www.po.Student;

public interface StudentService {

    // 注册学生
    public void registStudent(Student student);

    // 登录
    public Student login(Student student);

    // 验证学生名字是否存在
    public boolean existsStudentName( String studentName);

}
