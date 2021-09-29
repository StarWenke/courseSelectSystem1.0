package com.xingwenke.www.service.student;

import com.xingwenke.www.dao.student.StudentDao;
import com.xingwenke.www.dao.student.StudentDaoImpl;
import com.xingwenke.www.po.Student;

public class StudentServiceImpl implements StudentService {

    private StudentDao studentDao = new StudentDaoImpl();

    @Override
    public void registStudent(Student student) {
        studentDao.saveStudent(student);
    }

    @Override
    public Student login(Student student) {
        return studentDao.queryStudentByIdAndPwd(student.getStudent_id(),student.getStudent_pwd());
    }

    @Override
    public boolean existsStudentName( String studentName) {

        if (studentDao.queryStudentByName(studentName) != null){
            // 返回false说明可以使用
            return false;
        }

        return true;
    }
}
