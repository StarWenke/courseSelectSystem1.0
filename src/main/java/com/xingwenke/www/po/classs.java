package com.xingwenke.www.po;

public class classs {

    private Integer classId;
    private String className;

    public classs() {
    }

    public classs(Integer classId, String className) {
        this.classId = classId;
        this.className = className;
    }

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    @Override
    public String toString() {
        return "classs{" +
                "classId=" + classId +
                ", className='" + className + '\'' +
                '}';
    }
}
