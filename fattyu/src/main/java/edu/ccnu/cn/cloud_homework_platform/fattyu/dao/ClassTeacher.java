package edu.ccnu.cn.cloud_homework_platform.fattyu.dao;

import javax.persistence.*;

@Entity
@Table(name = "class_teacher")
public class ClassTeacher {
    @Id
    @GeneratedValue
    private int classTeacherId;

    @Column
    private int classId;

    @Column
    private int teacherId;

    public ClassTeacher(int classId, int teacherId) {
        this.classId = classId;
        this.teacherId = teacherId;
    }

    public int getClassTeacherId() {
        return classTeacherId;
    }

    public void setClassTeacherId(int classTeacherId) {
        this.classTeacherId = classTeacherId;
    }

    public int getClassId() {
        return classId;
    }

    public void setClassId(int classId) {
        this.classId = classId;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }
}
