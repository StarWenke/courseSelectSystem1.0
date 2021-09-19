package com.xingwenke.www.po;

public class choose {
    private Integer studentId;
    private Integer courseId;

    public choose() {
    }

    public choose(Integer studentId, Integer courseId) {
        this.studentId = studentId;
        this.courseId = courseId;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    @Override
    public String toString() {
        return "choose{" +
                "studentId=" + studentId +
                ", courseId=" + courseId +
                '}';
    }
}
