package com.ssm.entity;

import java.util.Date;

public class Course extends BaseEntity {
    private String name;
    private Teacher teacher;
    private Subject subject;
    private GradeClass gradeClass;
    private Date startTime;
    private Date endTime;
    private int passScore;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public GradeClass getGradeClass() {
        return gradeClass;
    }

    public void setGradeClass(GradeClass gradeClass) {
        this.gradeClass = gradeClass;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public int getPassScore() {
        return passScore;
    }

    public void setPassScore(int passScore) {
        this.passScore = passScore;
    }
}
