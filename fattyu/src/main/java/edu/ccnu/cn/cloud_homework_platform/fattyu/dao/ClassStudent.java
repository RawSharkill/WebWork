package edu.ccnu.cn.cloud_homework_platform.fattyu.dao;

import javax.persistence.*;

@Entity
@Table(name = "class_student")
public class ClassStudent {

    @Id
    @GeneratedValue
    private int classStudentId;

    @Column
    private int stuidentId;

    @Column
    private int classId;

    public ClassStudent(int stuidentId, int classId) {
        this.stuidentId = stuidentId;
        this.classId = classId;
    }

    public int getClassStudentId() {
        return classStudentId;
    }

    public void setClassStudentId(int classStudentId) {
        this.classStudentId = classStudentId;
    }

    public int getStuidentId() {
        return stuidentId;
    }

    public void setStuidentId(int stuidentId) {
        this.stuidentId = stuidentId;
    }

    public int getClassId() {
        return classId;
    }

    public void setClassId(int classId) {
        this.classId = classId;
    }
}
