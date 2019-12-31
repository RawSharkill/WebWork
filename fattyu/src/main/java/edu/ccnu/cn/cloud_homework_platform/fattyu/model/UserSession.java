package edu.ccnu.cn.cloud_homework_platform.fattyu.model;

public class UserSession {

    private int id;
    private int node;//类型
    private String name;
    private String password;

    public UserSession(int id, int node, String name, String password) {
        this.id = id;
        this.node = node;
        this.name = name;
        this.password = password;
    }
    public UserSession(){

    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNode() {
        return node;
    }

    public void setNode(int node) {
        this.node = node;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
