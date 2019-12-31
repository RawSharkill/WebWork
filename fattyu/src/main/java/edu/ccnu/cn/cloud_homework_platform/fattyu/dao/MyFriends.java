package edu.ccnu.cn.cloud_homework_platform.fattyu.dao;

import javax.persistence.*;

@Entity
@Table(name = "my_friends")
public class MyFriends {

    @Id
    @GeneratedValue
    private int myFrindId;

    @Column
    private int studentId;

    @Column
    private int friendId;

    public MyFriends(int studentId, int friendId) {
        this.studentId = studentId;
        this.friendId = friendId;
    }

    public int getMyFrindId() {
        return myFrindId;
    }

    public void setMyFrindId(int myFrindId) {
        this.myFrindId = myFrindId;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getFriendId() {
        return friendId;
    }

    public void setFriendId(int friendId) {
        this.friendId = friendId;
    }
}
