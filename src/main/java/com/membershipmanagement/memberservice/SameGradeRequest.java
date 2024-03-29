package com.membershipmanagement.memberservice;

import java.util.Objects;

public class SameGradeRequest {
    private String endsWith;
    private int grade;

    public SameGradeRequest(String endsWith, int grade) {
        this.endsWith = endsWith;
        this.grade = grade;
    }

    public String getEndsWith() {
        return endsWith;
    }

    public int getGrade() {
        return grade;
    }
}
