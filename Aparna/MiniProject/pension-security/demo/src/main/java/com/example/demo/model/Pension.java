package com.example.demo.model;
import org.springframework.boot.autoconfigure.domain.EntityScan;
@Entity
public class Pension{
    @Id
    private int id;
    private String name;
    private String age;
    private Integer balance_amount;
    private Integer phone;
    private String empStatus;
    private String pensionStatus;
    private String pensionmmyyy;
    private float installment;

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

    public String getEmpStatus() {
        return empStatus;
    }

    public void setEmpStatus(String empStatus) {
        this.empStatus = empStatus;
    }

    public String getPensionStatus() {
        return pensionStatus;
    }

    public void setPensionStatus(String pensionStatus) {
        this.pensionStatus = pensionStatus;
    }

    public String getPensionmmyyy() {
        return pensionmmyyy;
    }

    public void setPensionmmyyy(String pensionmmyyy) {
        this.pensionmmyyy = pensionmmyyy;
    }

    public float getInstallment() {
        return installment;
    }

    public void setInstallment(float installment) {
        this.installment = installment;
    }

    public Pension(int id) {
        this.id = id;
        this.name=name;
        this.age=age;
        this.balance_amount = balance_amount;
        this.phone=phone;
        this.pensionStatus=pensionStatus;
        this.empStatus=empStatus;
        this.pensionmmyyy=pensionmmyyy;
        this.installment=installment;
    }
}
