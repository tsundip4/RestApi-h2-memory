package com.example.studentInfoDemo.studentModel;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class StudentModel {
    @Id
    private int id;
    private String fName;
    private String lName;
    private int tuitionFee;

    public StudentModel() {
    }

    public StudentModel(int id, String fName, String lName, int tuitionFee) {
        this.id = id;
        this.fName = fName;
        this.lName = lName;
        this.tuitionFee = tuitionFee;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public int getTuitionFee() {
        return tuitionFee;
    }

    public void setTuitionFee(int tuitionFee) {
        this.tuitionFee = tuitionFee;
    }
}
