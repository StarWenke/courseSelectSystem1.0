package com.xingwenke.www.po;

import java.util.Date;

public class Course {
    private Integer courseId;
    private String courseName;
    private Integer gradeId;
    private Integer teacherId;
    private Integer studentId;
    private Date startTime;
    private Date finishTime;
    private Integer stuNum;

    public Course() {
    }

    public Course(Integer courseId, String courseName, Integer gradeId, Integer teacherId, Integer studentId, Date startTime, Date finishTime, Integer stuNum) {

        this.courseId = courseId;
        this.courseName = courseName;
        this.gradeId = gradeId;
        this.teacherId = teacherId;
        this.studentId = studentId;
        this.startTime = startTime;
        this.finishTime = finishTime;
        this.stuNum = stuNum;
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Integer getGradeId() {
        return gradeId;
    }

    public void setGradeId(Integer gradeId) {
        this.gradeId = gradeId;
    }

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(Date finishTime) {
        this.finishTime = finishTime;
    }

    public Integer getStuNum() {
        return stuNum;
    }

    public void setStuNum(Integer stuNum) {
        this.stuNum = stuNum;
    }

    @Override
    public String toString() {
        return "course{" +
                "courseId=" + courseId +
                ", courseName='" + courseName + '\'' +
                ", gradeId=" + gradeId +
                ", teacherId=" + teacherId +
                ", studentId=" + studentId +
                ", startTime=" + startTime +
                ", finishTime=" + finishTime +
                ", stuNum=" + stuNum +
                '}';
    }
}
