package edu.ccnu.cn.cloud_homework_platform.fattyu.dao;

import javax.persistence.*;

@Entity
@Table(name = "work_student_class")
public class WorkStudentClass {

    @Id
    @GeneratedValue
    private int workStudentClassId;

    @Column
    private int studentId;

    @Column
    private int classId;

    @Column
    private int homeworkId;

    public WorkStudentClass(int studentId, int classId, int homeworkId) {
        this.studentId = studentId;
        this.classId = classId;
        this.homeworkId = homeworkId;
    }

    public WorkStudentClass(){}
    public int getWorkStudentClassId() {
        return workStudentClassId;
    }

    public void setWorkStudentClassId(int workStudentClassId) {
        this.workStudentClassId = workStudentClassId;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getClassId() {
        return classId;
    }

    public void setClassId(int classId) {
        this.classId = classId;
    }

    public int getHomeworkId() {
        return homeworkId;
    }

    public void setHomeworkId(int homeworkId) {
        this.homeworkId = homeworkId;
    }
}
