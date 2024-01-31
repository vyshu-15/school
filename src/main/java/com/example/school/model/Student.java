// Write your code here
package com.example.school.model;

public class Student {
    private int StudentId;
    private String studentName;
    private String gender;
    private int standard;

    public Student(int studentId, String studentName, String gender, int standard) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.standard = standard;

    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public String getGenderd() {
        return gender;
    }

    public void setStandard(int standard) {
        this.standard = standard;
    }

    public int getStandard() {
        return standard;
    }
}