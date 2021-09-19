package com.xingwenke.www.po;

public class teacher {
    private Integer teacherId;
    private String teacherName;
    private String teacherPwd;
    private Integer majorId;

    public teacher() {
    }

    public teacher(Integer teacherId, String teacherName, String teacherPwd, Integer majorId) {
        this.teacherId = teacherId;
        this.teacherName = teacherName;
        this.teacherPwd = teacherPwd;
        this.majorId = majorId;
    }

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getTeacherPwd() {
        return teacherPwd;
    }

    public void setTeacherPwd(String teacherPwd) {
        this.teacherPwd = teacherPwd;
    }

    public Integer getMajorId() {
        return majorId;
    }

    public void setMajorId(Integer majorId) {
        this.majorId = majorId;
    }

    @Override
    public String toString() {
        return "teacher{" +
                "teacherId=" + teacherId +
                ", teacherName='" + teacherName + '\'' +
                ", teacherPwd='" + teacherPwd + '\'' +
                ", majorId=" + majorId +
                '}';
    }
}
