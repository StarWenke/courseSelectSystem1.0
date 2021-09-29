package com.xingwenke.www.test;

import com.xingwenke.www.po.Student;
import com.xingwenke.www.service.student.StudentService;
import com.xingwenke.www.service.student.StudentServiceImpl;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentServiceTest {

    StudentService studentService = new StudentServiceImpl();

    @Test
    public void registStudent() {
        studentService.registStudent(new Student(null, "王刚", "admin103", 101, 1001, 10001));
        studentService.registStudent(new Student(null, "李华", "admin223", 102, 1002, 10002));

    }

    @Test
    public void login() {

        System.out.println(studentService.login(new Student(1,null,"admin12", null, null, null)));

    }

    @Test
    public void existsStudentName() {
        if (studentService.existsStudentName("强")){
            System.out.println("用户名不存在");
        }else{
            System.out.println("用户名存在");
        }
    }
}