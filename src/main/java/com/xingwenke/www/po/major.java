package com.xingwenke.www.po;

public class major {

    private Integer majorId;
    private String majorName;

    public major() {
    }

    public major(Integer majorId, String majorName) {
        this.majorId = majorId;
        this.majorName = majorName;
    }

    public Integer getMajorId() {
        return majorId;
    }

    public void setMajorId(Integer majorId) {
        this.majorId = majorId;
    }

    public String getMajorName() {
        return majorName;
    }

    public void setMajorName(String majorName) {
        this.majorName = majorName;
    }

    @Override
    public String toString() {
        return "major{" +
                "majorId=" + majorId +
                ", majorName='" + majorName + '\'' +
                '}';
    }
}
