package com.example.Hospital.Management;

public class Nurse {
    private int nurseId;
    private String name;
    private int age;
    private String qualification;

    public Nurse(int nurseId, String name, int age, String qualification) {
        this.nurseId = nurseId;
        this.name = name;
        this.age = age;
        this.qualification = qualification;
    }

    public int getNurseId() {
        return nurseId;
    }

    public void setNurseId(int nurseId) {
        this.nurseId = nurseId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }
}
