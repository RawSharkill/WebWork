package edu.ccnu.cn.cloud_homework_platform.fattyu.dao;

import javax.persistence.*;

@Entity
@Table(name = "home_work")
public class HomeWork {

    @Id
    @GeneratedValue
    private int homeWorkId;

    @Column
    private String content;

    public HomeWork(String content) {
        this.content = content;
    }

    public int getHomeWorkId() {
        return homeWorkId;
    }

    public void setHomeWorkId(int homeWorkId) {
        this.homeWorkId = homeWorkId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
