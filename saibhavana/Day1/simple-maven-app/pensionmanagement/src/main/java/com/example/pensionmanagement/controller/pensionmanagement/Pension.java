package com.example.pensionmanagement.controller.pensionmanagement;

public class Pension {
    private int id;
    private String name;
    private String age;
    private Integer balance_amount;
    private Integer phone;
    private String empstatus;
    private String pensionstatus;
    private String pensionmmyy;
    private Integer installment;

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

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Integer getBalance_amount() {
        return balance_amount;
    }

    public void setBalance_amount(Integer balance_amount) {
        this.balance_amount = balance_amount;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
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

    public Integer getInstallment() {
        return installment;
    }

    public void setInstallment(Integer installment) {
        this.installment = installment;
    }

    public Pension(int id, String name, String age, Integer balance_amount, Integer phone, String empstatus, String pensionstatus, String pensionmmyy, Integer installment) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.balance_amount = balance_amount;
        this.phone = phone;
        this.empstatus = empstatus;
        this.pensionstatus = pensionstatus;
        this.pensionmmyy = pensionmmyy;
        this.installment = installment;
    }
}