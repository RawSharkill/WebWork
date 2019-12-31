package edu.ccnu.cn.cloud_homework_platform.fattyu.dao;

import org.springframework.stereotype.Controller;

import javax.persistence.*;

@Entity
@Table(name="teacher")
public class Teacher {

    @Id
    @GeneratedValue
    private int teacherId;

    @Column
    private String teacherName;

    @Column
    private String number;//教师号

    @Column
    private String degree;

    @Column
    private int type;

    @Column
    private String password;


    public Teacher(String teacherName, String number, String degree, int type, String password) {
        this.teacherName = teacherName;
        this.number = number;
        this.degree = degree;
        this.type = type;
        this.password = password;
    }

    public Teacher(){

    }
    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Teacher(String teacherName, String institute, String degree) {
        this.teacherName = teacherName;
        this.number= institute;
        this.degree = degree;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getInstitute() {
        return number;
    }

    public void setInstitute(String institute) {
        this.number= institute;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }
}
