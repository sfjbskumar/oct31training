package com.example.PensionManagementSystem.model;


import org.springframework.stereotype.Component;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Component
@Entity
public class Pension {
    @Id
    @GeneratedValue
    @Column
    private int id;
    @Column
    private  String name;
    @Column
    private  String age;
    @Column
    private  int balanceamount ;
    @Column
    private int phone;
    @Column
    private String empstatus;
    @Column
    private String pensionstatus;
    @Column
    private String  pensionmmyy;
    @Column
    private int installment;

    public Pension(){

    }



    public Pension(int id, String name, String age, int balanceamount, int phone, String empstatus, String pensionstatus, String pensionmmyy, int installment) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.balanceamount = balanceamount;
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

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public int getBalanceamount() {
        return balanceamount;
    }

    public void setBalanceamount(int balanceamount) {
        this.balanceamount = balanceamount;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone= phone;
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


}