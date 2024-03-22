package com.membershipmanagement.memberservice;

import java.util.Date;

public class Member {
    private int id;
    private String name;
    private Date birthDate;
    private Date enrollmentDay;
    private int grade;

    public Member(int id, String name, Date birthDate, Date enrollmentDay, int grade) {
        this.id = id;
        this.name = name;
        this.birthDate = birthDate;
        this.enrollmentDay = enrollmentDay;
        this.grade = grade;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public Date getEnrollmentDay() {
        return enrollmentDay;
    }

    public int getGrade() {
        return grade;
    }
}