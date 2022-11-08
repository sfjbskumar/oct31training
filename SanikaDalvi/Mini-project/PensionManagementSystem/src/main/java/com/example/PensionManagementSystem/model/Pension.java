package com.example.PensionManagementSystem.model;

public class Pension {
    private int id;
    private String name;
    private int age;
    private int balance_amount;
    private int phone;
    private String empstatus;
    private String pensionStatus;
    private String pensionmmyy;


    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public int getBalance_amount() {
        return balance_amount;
    }
    public int getPhone() {
        return phone;
    }
    public String getEmpstatus() {
        return empstatus;
    }
    public String getPensionStatus() {
        return pensionStatus;
    }
    public String getPensionmmyy() {
        return pensionmmyy;
    }


    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setBalance_amount(int balance_amount) {
        this.balance_amount = balance_amount;
    }
    public void setPhone(int phone) {
        this.phone = phone;
    }
    public void setEmpstatus(String empstatus) {
        this.empstatus = empstatus;
    }
    public void setPensionStatus(String pensionStatus) {
        this.pensionStatus = pensionStatus;
    }
    public void setPensionmmyy(String pensionmmyy) {
        this.pensionmmyy = pensionmmyy;
    }

    public Pension(int id, String name, int age, int balance_amount, int phone, String empstatus, String pensionStatus, String pensionmmyy) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.balance_amount = balance_amount;
        this.phone = phone;
        this.empstatus = empstatus;
        this.pensionStatus = pensionStatus;
        this.pensionmmyy = pensionmmyy;
    }
}
