package com.company.collection.sorting;

public class Student {

    private int rollNo;

    private String sName;

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public Student(int rollNo, String sName) {
        this.rollNo = rollNo;
        this.sName = sName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", sName='" + sName + '\'' +
                '}';
    }
}
