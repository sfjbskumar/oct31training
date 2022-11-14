package com.example.PensionManagementSystem.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Pension {
    @Id
    @GeneratedValue
    @Column
    private int id;
    @Column
    private String name;
    @Column
    private int age;
    @Column
    private int balanceamount;
    @Column
    private String phone;
    @Column
    private String empstatus;
    @Column
    private String pensionStatus;
    @Column
    private String pensionmmyy;
    @Column
    private int installment;



    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public int getBalanceamount() {
        return balanceamount;
    }
    public String getPhone() {
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
    public int getInstallment(){
        return installment;
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
    public void setBalanceamount(int balanceamount) {
        this.balanceamount = balanceamount;
    }
    public void setPhone(String phone) {
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
    public void setInstallment(int installment){
        this.installment = installment;
    }
public Pension(){

}
    public Pension(int id, String name, int age, int balanceamount, String phone, String empstatus, String pensionStatus, String pensionmmyy, int installment) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.balanceamount = balanceamount;
        this.phone = phone;
        this.empstatus = empstatus;
        this.pensionStatus = pensionStatus;
        this.pensionmmyy = pensionmmyy;
        this.installment = installment;
    }
}
