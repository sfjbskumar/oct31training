package com.example.demo.model;

import org.springframework.data.annotation.Id;

@Entity
public class Pension {

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

    public int getBalance_amount() {
        return balance_amount;
    }

    public void setBalance_amount(int balance_amount) {
        this.balance_amount = balance_amount;
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

    public Pension(int id, String name, int age, int balance_amount, int phone, String empstatus, String pensionstatus, String pensionmmyy, int installment) {
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
    public Pension(){

    }

    @Id
    @GeneratedValue
    @Column
    private int id;
    @Column
    private String name;
    @Column
    private int age;
    @Column
    private int balance_amount;
    @Column
    private int phone;
    @Column
    private String empstatus;
    @Column
    private String pensionstatus;
    @Column
    private String pensionmmyy ;
    @Column
    private int installment;
}
