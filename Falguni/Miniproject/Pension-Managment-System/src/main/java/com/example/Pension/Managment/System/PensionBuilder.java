package com.example.Pension.Managment.System;

public class PensionBuilder {
    private int id;
    private String name;
    private int age;
    private int balance;
    private String mobile;
    private String empStatus;
    private String pensionStatus;
    private String pensionMMYY;
    private int installment;

    public PensionBuilder setId(int id) {
        this.id = id;
        return this;
    }

    public PensionBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PensionBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public PensionBuilder setBalance(int balance) {
        this.balance = balance;
        return this;
    }

    public PensionBuilder setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }

    public PensionBuilder setEmpStatus(String empStatus) {
        this.empStatus = empStatus;
        return this;
    }

    public PensionBuilder setPensionStatus(String pensionStatus) {
        this.pensionStatus = pensionStatus;
        return this;
    }

    public PensionBuilder setPensionMMYY(String pensionMMYY) {
        this.pensionMMYY = pensionMMYY;
        return this;
    }

    public PensionBuilder setInstallment(int installment) {
        this.installment = installment;
        return this;
    }

    public Pension createPension() {
        return new Pension(id, name, age, balance, mobile, empStatus, pensionStatus, pensionMMYY, installment);
    }
}