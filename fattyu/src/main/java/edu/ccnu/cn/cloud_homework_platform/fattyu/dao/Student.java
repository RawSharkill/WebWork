package edu.ccnu.cn.cloud_homework_platform.fattyu.dao;

import javax.persistence.*;

@Entity
@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue
    private int studentId;

    @Column
    private String studentName;

    @Column
    private String number;//学号

    @Column
    private String institute;//学院

    @Column
    private int type;

    @Column
    private String password;

    public Student(String studentName, String number, String institute, int type, String password) {
        this.studentName = studentName;
        this.number = number;
        this.institute = institute;
        this.type = type;
        this.password = password;
    }

    public Student(){

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

    public Student(String studentName, String number, String institute) {
        this.studentName = studentName;
        this.number = number;
        this.institute = institute;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getInstitute() {
        return institute;
    }

    public void setInstitute(String institute) {
        this.institute = institute;
    }
}
