package com.xingwenke.www.po;

public class Student {
    private Integer student_id;
    private String student_name;
    private String student_pwd;
    private Integer major_id;
    private Integer grade_id;
    private Integer class_id;

    public Student() {
    }

    public Student(Integer student_id, String student_name, String student_pwd, Integer major_id, Integer grade_id, Integer class_id) {
        this.student_id = student_id;
        this.student_name = student_name;
        this.student_pwd = student_pwd;
        this.major_id = major_id;
        this.grade_id = grade_id;
        this.class_id = class_id;
    }

    public Integer getStudent_id() {
        return student_id;
    }

    public void setStudent_id(Integer student_id) {
        this.student_id = student_id;
    }

    public String getStudent_name() {
        return student_name;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

    public String getStudent_pwd() {
        return student_pwd;
    }

    public void setStudent_pwd(String student_pwd) {
        this.student_pwd = student_pwd;
    }

    public Integer getMajor_id() {
        return major_id;
    }

    public void setMajor_id(Integer major_id) {
        this.major_id = major_id;
    }

    public Integer getGrade_id() {
        return grade_id;
    }

    public void setGrade_id(Integer grade_id) {
        this.grade_id = grade_id;
    }

    public Integer getClass_id() {
        return class_id;
    }

    public void setClass_id(Integer class_id) {
        this.class_id = class_id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "student_id=" + student_id +
                ", student_name='" + student_name + '\'' +
                ", student_pwd='" + student_pwd + '\'' +
                ", major_id=" + major_id +
                ", grade_id=" + grade_id +
                ", class_id=" + class_id +
                '}';
    }
}
