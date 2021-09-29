package com.xingwenke.www.test;

import com.xingwenke.www.dao.student.StudentDao;
import com.xingwenke.www.dao.student.StudentDaoImpl;
import com.xingwenke.www.po.Student;
import org.junit.Test;

public class StudentDaoTest {

    // 放在外面之后，就可以供下面的方法调用了
    StudentDao studentDao = new StudentDaoImpl();

    @Test
    public void queryStudentByName() {

        if (studentDao.queryStudentByName("张强") == null){
            System.out.println("用户名可用！");
        }else{
            System.out.println("用户名已存在！");
        }

//        System.out.println(studentDao.queryStudentByName("张强"));
    }

    @Test
    public void queryStudentByIdAndPwd() {
        if(studentDao.queryStudentByIdAndPwd(1,"admin12") == null){
            System.out.println("用户名或密码错误，请重试！");
        }else{
            System.out.println("登录/查询成功");
        }
//        System.out.println(studentDao.queryStudentByIdAndPwd(1,"admin12"));
    }

    @Test
    public void saveStudent() {
        // 我们定义的这个方法，需要传递的参数是Student，所以我们需要直接在里面new一个Student
        studentDao.saveStudent(new Student(null,"张强","admin123",102,1002,10002));
        if (studentDao.saveStudent(new Student(null,"张强","admin123",102,1002,10002)) != 0){
            System.out.println("新增学生成功！");
        }else{
            System.out.println("新增学生失败！");
        }
    }

}