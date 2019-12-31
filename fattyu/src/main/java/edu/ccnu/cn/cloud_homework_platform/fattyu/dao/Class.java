package edu.ccnu.cn.cloud_homework_platform.fattyu.dao;

import javax.persistence.*;

@Entity
@Table(name="class")
public class Class {

    @Id
    @GeneratedValue
    private int classId;

    @Column
    private String className;

    @Column
    private String time;

    @Column
    private String intro;

    public Class(String className, String time, String intro) {
        this.className = className;
        this.time = time;
        this.intro = intro;
    }

    public int getClassId() {
        return classId;
    }

    public void setClassId(int classId) {
        this.classId = classId;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }
}
