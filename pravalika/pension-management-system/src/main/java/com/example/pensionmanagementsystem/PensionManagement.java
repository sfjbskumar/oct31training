package com.example.pensionmanagementsystem;

public class PensionManagement {

    private int id;
    private  String name;
    private  String age;
    private  Integer balanceamount ;
    private Integer Phone;
    private String empstatus;
    private String pensionstatus;

    public PensionManagement(int id, String name, String age, Integer balanceamount, Integer phone, String empstatus, String pensionstatus, String pensionmmyy, int installment) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.balanceamount = balanceamount;
        Phone = phone;
        this.empstatus = empstatus;
        this.pensionstatus = pensionstatus;
        this.pensionmmyy = pensionmmyy;
        this.installment = installment;
    }

    private String  pensionmmyy;
    private int installment;

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

    public Integer getBalanceamount() {
        return balanceamount;
    }

    public void setBalanceamount(Integer balanceamount) {
        this.balanceamount = balanceamount;
    }

    public Integer getPhone() {
        return Phone;
    }

    public void setPhone(Integer phone) {
        Phone = phone;
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
