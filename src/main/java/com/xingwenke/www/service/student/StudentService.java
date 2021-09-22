package com.xingwenke.www.service.student;

import com.xingwenke.www.po.Student;

public interface StudentService {

    // 用户登录
    public Student login (Integer studentId,String studentPwd);

}
