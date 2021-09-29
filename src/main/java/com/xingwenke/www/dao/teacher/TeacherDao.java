package com.xingwenke.www.dao.teacher;

import com.xingwenke.www.po.Teacher;

public interface TeacherDao {

    // 通过名字查找老师/管理员
    Teacher queryTeacherByName(String teacherName);

    // 通过id和密码查询
    Teacher queryTeacherByIdAndPwd(Integer teacherId, String teacherPwd);

    // 保存新增老师/管理员
    int saveTeacher(Teacher teacher);
}
