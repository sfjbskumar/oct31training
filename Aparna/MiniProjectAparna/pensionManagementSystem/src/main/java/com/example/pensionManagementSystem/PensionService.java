package com.example.pensionManagementSystem;

import com.example.pensionManagementSystem.model.Pension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
@Transactional
public class PensionService {
    @Autowired
    PensionRepository pensionRepository;


    public String save(Pension pension)
    {
        pensionRepository.save(pension);
        return "saved";
    }
    public String checkStatus(int id)
    {
        Pension pension=new Pension();
        pension = pensionRepository.findById(id).get();
        pension.getEmpStatus();
        pension.getPensionStatus();
        return "Employee Status is: "+pension.getEmpStatus()+",  Pension Status is: "+pension.getPensionStatus();

    }
    public String checkBalance(int id)
    {
        Pension pension=new Pension();
        pension = pensionRepository.findById(id).get();
        pension.getBalance();
        return "Employee Balance is: "+pension.getBalance();
    }
    public String checkApplication(int id)
    {
        Pension pension=new Pension();
        pension = pensionRepository.findById(id).get();
        pension.getId();
        pension.getName();
        pension.getMobile();
        pension.getAge();
        pension.getBalance();
        pension.getPensionStatus();
        pension.getEmpStatus();
        pension.getPensionMMYY();
        pension.getInstallment();
        return "Employee Id: "+pension.getId() +
                "\nEmployee Name: "+pension.getName()+
                "\nEmployee PhoneNo: "+pension.getMobile()
                +"\nEmployee Age: "+pension.getAge()+
                "\nEmployee Balance: "+pension.getBalance()
                +"\nEmployee Pension Status: "+pension.getPensionStatus()
                +"\nEmployee Installment: "+pension.getInstallment()
                +"\nEmployee Pension month: "+pension.getPensionMMYY();

        //return "Employee details :-" + pensionRepository.findById(id).get();

    }

    //pension will be issued to all applicants with empStatus R and PensionStatus Y
    public void issuePension(){
        //current MMYY
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMyy");
        String currentMMYY = simpleDateFormat.format(new Date());

        SimpleDateFormat monthFormat = new SimpleDateFormat("MM");
        String currentMonth=monthFormat.format(new Date());
        SimpleDateFormat yearFormat = new SimpleDateFormat("yy");
        String currentYear=yearFormat.format(new Date());

        //previous MMYY
        int prevMonth = Integer.parseInt(currentMonth)-1;
        String previousMMYY = String.valueOf(prevMonth)+currentYear;
        if(previousMMYY.length()==3){
            previousMMYY = "0"+previousMMYY;
        }





        pensionRepository.issuePension("R","Y", currentMMYY, previousMMYY);
    }

    //loadPension to all applicants with empStatus A and PensionStatus N
    public void loadPension(){
        //current MMYY
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMyy");
        String currentMMYY = simpleDateFormat.format(new Date());

        SimpleDateFormat monthFormat = new SimpleDateFormat("MM");
        String currentMonth=monthFormat.format(new Date());
        SimpleDateFormat yearFormat = new SimpleDateFormat("yy");
        String currentYear=yearFormat.format(new Date());

        //previous MMYY
        int prevMonth = Integer.parseInt(currentMonth)-1;
        String previousMMYY = String.valueOf(prevMonth)+currentYear;
        if(previousMMYY.length()==3){
            previousMMYY = "0"+previousMMYY;
        }

        pensionRepository.loadPension("A","N", currentMMYY, previousMMYY);
    }



}