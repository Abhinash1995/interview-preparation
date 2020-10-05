package com.company.javasort;

public class Student {

    private int id;

    private String fName;

    private String sName;

    public Student(int id, String fName, String sName) {
        this.id = id;
        this.fName = fName;
        this.sName = sName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", fName='" + fName + '\'' +
                ", sName='" + sName + '\'' +
                '}';
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

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }
}
