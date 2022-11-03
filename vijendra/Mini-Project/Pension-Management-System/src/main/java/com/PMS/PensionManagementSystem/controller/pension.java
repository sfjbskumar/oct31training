package com.PMS.PensionManagementSystem.controller;

//import org.springframework.web.bind.annotation.RestController;

//@RestController
public class pension {

    public pension(int id, String name, int age, int balance, int phone, String empstatus, String pensionstatus, String pensionmmyy, int installment) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.balance = balance;
        this.phone = phone;
        this.empstatus = empstatus;
        this.pensionstatus = pensionstatus;
        this.pensionmmyy = pensionmmyy;
        this.installment = installment;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getEmpstatus() {
        return empstatus;
    }

    public void setEmpstatus(String empstatus) {
        this.empstatus = empstatus;
    }

    public String getPensionstatus() {
        return pensionstatus;
    }

    public void setPensionstatus(String pensionstatus) {
        this.pensionstatus = pensionstatus;
    }

    public String getPensionmmyy() {
        return pensionmmyy;
    }

    public void setPensionmmyy(String pensionmmyy) {
        this.pensionmmyy = pensionmmyy;
    }

    public int getInstallment() {
        return installment;
    }

    public void setInstallment(int installment) {
        this.installment = installment;
    }

    private int id;

    private String name;

    private int age;

    private int balance;

    private int phone;

    private String empstatus;

    private String pensionstatus;

    private String pensionmmyy;

    private int installment;

}
