package com.membershipmanagement.memberservice;

import java.time.LocalDate;
import java.util.Date;

public class Member {
    private int id;
    private String name;
    private LocalDate birthDate;
    private LocalDate enrollmentDay;
    private String schoolName;
    private int grade;

    public Member(int id, String name, LocalDate birthDate, LocalDate enrollmentDay, String schoolName, int grade) {
        this.id = id;
        this.name = name;
        this.birthDate = birthDate;
        this.enrollmentDay = enrollmentDay;
        this.schoolName = schoolName;
        this.grade = grade;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public LocalDate getEnrollmentDay() {
        return enrollmentDay;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public int getGrade() {
        return grade;
    }
}
