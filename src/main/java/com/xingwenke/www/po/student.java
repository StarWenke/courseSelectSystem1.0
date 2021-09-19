package com.xingwenke.www.po;

public class student {
    private Integer studentId;
    private String studentName;
    private String studentPwd;
    private Integer majorId;
    private Integer gradeId;
    private Integer classId;

    public student() {
    }

    public student(Integer studentId, String studentName, String studentPwd, Integer majorId, Integer gradeId, Integer classId) {

        this.studentId = studentId;
        this.studentName = studentName;
        this.studentPwd = studentPwd;
        this.majorId = majorId;
        this.gradeId = gradeId;
        this.classId = classId;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentPwd() {
        return studentPwd;
    }

    public void setStudentPwd(String studentPwd) {
        this.studentPwd = studentPwd;
    }

    public Integer getMajorId() {
        return majorId;
    }

    public void setMajorId(Integer majorId) {
        this.majorId = majorId;
    }

    public Integer getGradeId() {
        return gradeId;
    }

    public void setGradeId(Integer gradeId) {
        this.gradeId = gradeId;
    }

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    @Override
    public String toString() {
        return "student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", studentPwd='" + studentPwd + '\'' +
                ", majorId=" + majorId +
                ", gradeId=" + gradeId +
                ", classId=" + classId +
                '}';
    }
}
