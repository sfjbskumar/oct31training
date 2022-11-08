package com.student.app;

import org.springframework.stereotype.Component;

@Component
public class Student {
    String rollNo;
    String name;
    String std;

    public Student(){

    }
    public Student(String rollNo, String name, String std) {
        this.rollNo = rollNo;
        this.name = name;
        this.std = std;
    }



    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStd() {
        return std;
    }

    public void setStd(String std) {
        this.std = std;
    }


}
