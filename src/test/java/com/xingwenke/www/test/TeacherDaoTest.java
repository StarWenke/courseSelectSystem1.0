package com.xingwenke.www.test;

import com.xingwenke.www.dao.teacher.TeacherDao;
import com.xingwenke.www.dao.teacher.TeacherDaoImpl;
import com.xingwenke.www.po.Teacher;
import org.junit.Test;

import static org.junit.Assert.*;

public class TeacherDaoTest {

    TeacherDao teacherDao = new TeacherDaoImpl();

    @Test
    public void queryTeacherByName() {
        if (teacherDao.queryTeacherByName("张老师") == null){
            System.out.println("名字可用！");
        }else{
            System.out.println("名字不可用！");
        }
    }

    @Test
    public void queryTeacherByIdAndPwd() {

        if (teacherDao.queryTeacherByIdAndPwd(201,"manager001") == null){
            System.out.println("用户名或密码错误");
        }else{
            System.out.println("登录/查询成功");
        }

    }

    @Test
    public void saveTeacher() {
        if (teacherDao.saveTeacher(new Teacher(null,"王老师","manager002",102)) != 0){
            System.out.println("新增管理员/老师成功");
        }else{
            System.out.println("新增管理员/老师失败");
        }
    }
}