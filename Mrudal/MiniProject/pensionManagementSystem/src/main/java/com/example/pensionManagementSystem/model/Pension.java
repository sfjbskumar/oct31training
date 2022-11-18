package com.example.pensionManagementSystem.model;


import org.springframework.stereotype.Component;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="pension")
@Table(name="pension")
@Component
public class Pension {


   @Id
   @Column
    private int id;

   @Column
   private String name;

    @Column
    private Integer age;

    @Column
    private Integer balance;

    @Column
    private String mobile;

    @Column
    private String empStatus;

    @Column
    private String pensionStatus;

    @Column
    private String pensionMMYY;

    @Column
    private Integer installment;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Integer getBalance() {
        return balance;
    }

    public String getMobile() {
        return mobile;
    }

    public String getEmpStatus() {
        return empStatus;
    }

    public String getPensionStatus() {
        return pensionStatus;
    }

    public String getPensionMMYY() {
        return pensionMMYY;
    }

    public Integer getInstallment(){
        return installment;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public void setEmpStatus(String empStatus) {
        this.empStatus = empStatus;
    }

    public void setPensionStatus(String pensionStatus) {
        this.pensionStatus = pensionStatus;
    }

    public void setPensionMMYY(String pensionMMYY) {
        this.pensionMMYY = pensionMMYY;
    }

    public void setInstallment(Integer installment){this.installment=installment;}

    public Pension(int id, String name, Integer age, Integer balance_amount, String  phone, String empStatus, String pensionStatus, String pensionMMYY,Integer installment) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.balance = balance;
        this.mobile = mobile;
        this.empStatus = empStatus;
        this.pensionStatus = pensionStatus;
        this.pensionMMYY= pensionMMYY;
        this.installment=installment;


    }
    public Pension(){

    }
}

