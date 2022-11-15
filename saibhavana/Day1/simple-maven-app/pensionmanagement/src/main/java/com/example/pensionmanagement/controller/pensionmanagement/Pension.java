package com.example.pensionmanagement.controller.pensionmanagement;


import org.springframework.stereotype.Component;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

//@Component
@Entity
public class Pension {


    @Id
    @GeneratedValue
    @Column
    private int id;
    @Column
    private String name;
    @Column
    private String age;
    @Column
    private  int BalanceAmount;
    @Column
    private int phoneNo;
    @Column
    private String PensionStatus;
    @Column
    private String pensionmmyy;
    @Column
    private int installment;
    @Column
    private String empStatus;

    public Pension(){

    }

    public Pension(int id, String name, String age, int balanceAmount, int phoneNo, String pensionStatus, String pensionmmyy, int installment, String empStatus) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.BalanceAmount = balanceAmount;
        this.phoneNo = phoneNo;
        this.PensionStatus = pensionStatus;
        this.pensionmmyy = pensionmmyy;
        this.installment = installment;
        this.empStatus = empStatus;
    }

    public String getEmpStatus() {
        return empStatus;
    }

    public void setEmpStatus(String empStatus) {
        this.empStatus = empStatus;
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

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public int getBalanceAmount() {
        return BalanceAmount;
    }

    public void setBalanceAmount(int balanceAmount) {
        BalanceAmount = balanceAmount;
    }

    public int getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(int phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getPensionStatus() {
        return PensionStatus;
    }

    public void setPensionStatus(String pensionStatus) {
        PensionStatus = pensionStatus;
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

    public void setBalance_amount(Integer balance_amount) {
    }
}