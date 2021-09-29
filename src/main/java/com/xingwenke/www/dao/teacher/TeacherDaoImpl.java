package com.xingwenke.www.dao.teacher;

import com.xingwenke.www.dao.BaseDao;
import com.xingwenke.www.po.Teacher;

public class TeacherDaoImpl extends BaseDao implements TeacherDao{


    @Override
    public Teacher queryTeacherByName(String teacherName) {
        String sql = "select `teachr_id`, `teacher_name`, `teacher_pwd`, `major_id` from `teacher` where `teacher_name` = ?";
        return queryForOne(Teacher.class, sql, teacherName);
    }

    @Override
    public Teacher queryTeacherByIdAndPwd(Integer teacherId, String teacherPwd) {
        String sql = "select `teacher_id`, `teacher_name`, `teacher_pwd`, `major_id` from `teacher` where `teacher_id` = ? and `teacher_pwd`=?";
        return queryForOne(Teacher.class, sql, teacherId, teacherPwd);
    }

    @Override
    public int saveTeacher(Teacher teacher) {
        String sql = "insert into `teacher` (`teacher_id`, `teacher_name`, `teacher_pwd`, `major_id`) values(?,?,?,?)";
        return update(sql, teacher.getTeacherId(), teacher.getTeacherName(), teacher.getTeacherPwd(), teacher.getMajorId());
    }
}
