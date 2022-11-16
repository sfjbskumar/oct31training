package com.example.pensionmanagement.controller.pensionmanagement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
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
        return "Employee Status is:-"+pension.getEmpStatus()+" Pension Status is:-"+pension.getPensionStatus();

    }
    public String checkBalance(int id)
    {
        Pension pension=new Pension();
        pension = pensionRepository.findById(id).get();
        pension.getBalanceAmount();
        return "Employee Balance is:-"+pension.getBalanceAmount();
    }
    public String checkApplication(int id)
    {
        Pension pension=new Pension();
        pension = pensionRepository.findById(id).get();
        pension.getId();
        pension.getName();
        pension.getPhoneNo();
        pension.getAge();
        pension.getBalanceAmount();
        pension.getPensionStatus();
        pension.getEmpStatus();
        pension.getPensionmmyy();
        pension.getInstallment();
        return "Employee Id:-"+pension.getId() +
                "\nEmployee Name:-"+pension.getName()+
                "\nEmployee PhoneNo:-"+pension.getPhoneNo()
                +"\nEmployee Age:-"+pension.getAge()+
                "\nEmployee Balance:-"+pension.getBalanceAmount()
                +"\nEmployee Pension Status:-"+pension.getPensionStatus()
                +"\nEmployee Installment:-"+pension.getInstallment()
                +"\nEmployee Pension month:-"+pension.getPensionmmyy();

        //return "Employee details :-" + pensionRepository.findById(id).get();

    }

 /*   public void issuePension() {
        pensionRepository.issuePension("R","Y", "1122", "1022");
    }

    public void loadPension() {
        pensionRepository.loadPension("A","N", "1122","1022");
    }

  */

}