package com.example.projectMini.Mini;

import org.springframework.stereotype.Component;
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
     private String age;
     @Column
     private int balanceAmount;
     @Column
     private int phoneNo;
     @Column
     private String pensionStatus;
     @Column
     private String pensionmmyy;
     @Column
     private int installment;
     @Column
     private String empStatus;

     public Pension() {
     }

     public Pension(int id, String name, String age, int balanceAmount, int phoneNo, String pensionStatus, String pensionmmyy, int installment, String empStatus) {
         this.id = id;
         this.name = name;
         this.age = age;
         this.balanceAmount = balanceAmount;
         this.phoneNo = phoneNo;
         this.pensionStatus = pensionStatus;
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
                                        }

