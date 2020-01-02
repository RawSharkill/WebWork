package edu.ccnu.cn.cloud_homework_platform.fattyu.dao;

import org.springframework.data.annotation.TypeAlias;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "class_file")
public class ClassFile {

    @Id
    @GeneratedValue
    private int classFileId;

    @Column
    private int classId;

    @Column
    private String file;

    public ClassFile(int classId, String file) {
        this.classId = classId;
        this.file = file;
    }

    public int getClassFileId() {
        return classFileId;
    }

    public void setClassFileId(int classFileId) {
        this.classFileId = classFileId;
    }

    public int getClassId() {
        return classId;
    }

    public void setClassId(int classId) {
        this.classId = classId;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }
}
