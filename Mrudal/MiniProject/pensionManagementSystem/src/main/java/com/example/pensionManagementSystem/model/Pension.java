package com.example.pensionManagementSystem.model;

public class Pension {

    private int id;

    private String name;

    private String age;

    private Integer balance_amount;

    private Integer phone;

    private String empstatus;

    private String pensionStatus;

    private String pensionmmyyy;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public Integer getBalance_amount() {
        return balance_amount;
    }

    public Integer getPhone() {
        return phone;
    }

    public String getEmpstatus() {
        return empstatus;
    }

    public String getPensionStatus() {
        return pensionStatus;
    }

    public String getPensionmmyyy() {
        return pensionmmyyy;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setBalance_amount(Integer balance_amount) {
        this.balance_amount = balance_amount;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public void setEmpstatus(String empstatus) {
        this.empstatus = empstatus;
    }

    public void setPensionStatus(String pensionStatus) {
        this.pensionStatus = pensionStatus;
    }

    public void setPensionmmyyy(String pensionmmyyy) {
        this.pensionmmyyy = pensionmmyyy;
    }

    public Pension(int id, String name, String age, Integer balance_amount, Integer phone, String empstatus, String pensionStatus, String pensionmmyyy) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.balance_amount = balance_amount;
        this.phone = phone;
        this.empstatus = empstatus;
        this.pensionStatus = pensionStatus;
        this.pensionmmyyy = pensionmmyyy;


    }
}

