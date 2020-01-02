package edu.ccnu.cn.cloud_homework_platform.fattyu.dao;

import org.springframework.data.annotation.TypeAlias;

import javax.persistence.*;

@Entity
@Table(name ="record")
public class Record {
    @Id
    @GeneratedValue
    private int recordId;

    @Column
    private int studentId;

    @Column
    private int classId;

    @Column
    private int teacherId;


    @Column
    private int score;

    public Record(){}

    public Record(int studentId, int classId, int teacherId, int score) {
        this.studentId = studentId;
        this.classId = classId;
        this.teacherId = teacherId;
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getRecordId() {
        return recordId;
    }

    public void setRecordId(int recordId) {
        this.recordId = recordId;
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

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }
}
