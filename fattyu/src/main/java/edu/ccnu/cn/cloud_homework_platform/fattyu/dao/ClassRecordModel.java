package edu.ccnu.cn.cloud_homework_platform.fattyu.dao;

public class ClassRecordModel {
    private String className;
    private String teacherName;
    private long time;
    private String intro;
    private int score;

    public ClassRecordModel(String className, String teacherName, long time, String intro, int score) {
        this.className = className;
        this.teacherName = teacherName;
        this.time = time;
        this.intro = intro;
        this.score = score;
    }

    public ClassRecordModel(){}

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
