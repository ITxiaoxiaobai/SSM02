package com.ssm.entity;

public class Student extends User {
    private static final long serialVersionUID = 1L;
   private GradeClass gradeClass;

    public GradeClass getGradeClass() {
        return gradeClass;
    }

    public void setGradeClass(GradeClass gradeClass) {
        this.gradeClass = gradeClass;
    }
}
