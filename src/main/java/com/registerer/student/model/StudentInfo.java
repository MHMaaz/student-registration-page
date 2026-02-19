package com.registerer.student.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class StudentInfo {
    @Id
    private int student_id;
    private String student_name;
    private String student_dep;
    private String student_dob;
    public int getStudent_id() {
        return student_id;
    }
    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }
    public String getStudent_name() {
        return student_name;
    }
    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }
    public String getStudent_dep() {
        return student_dep;
    }
    public void setStudent_dep(String student_dep) {
        this.student_dep = student_dep;
    }
    public String getStudent_dob() {
        return student_dob;
    }
    public void setStudent_dob(String student_dob) {
        this.student_dob = student_dob;
    }
    @Override
    public String toString() {
        return "StudentInfo [student_id=" + student_id + ", student_name=" + student_name + ", student_dep="
                + student_dep + ", student_dob=" + student_dob + "]";
    }
    
}
