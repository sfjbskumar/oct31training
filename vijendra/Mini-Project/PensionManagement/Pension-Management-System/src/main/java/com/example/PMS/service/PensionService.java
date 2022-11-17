package com.example.PMS.service;

import com.example.PMS.Pension;
import com.example.PMS.repository.PensionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.text.SimpleDateFormat;
import java.util.Date;

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
        pension.getEmpstatus();
        pension.getPensionstatus();
        return "Employee Status is:-"+pension.getEmpstatus()+" Pension Status is:-"+pension.getPensionstatus();

    }
    public String checkBalance(int id)
    {
        Pension pension=new Pension();
        pension = pensionRepository.findById(id).get();
        pension.getBalanceamount();
        return "Employee Balance is:-"+pension.getBalanceamount();
    }
    public String checkApplication(int id)
    {
        Pension pension=new Pension();
      pension = pensionRepository.findById(id).get();
        pension.getId();
        pension.getName();
        pension.getPhone();
        pension.getAge();
        pension.getBalanceamount();
        pension.getPensionstatus();
        pension.getEmpstatus();
        pension.getPensionMMYY();
        pension.getInstallment();
        return "Employee Id:-"+pension.getId() +
                "\nEmployee Name:-"+pension.getName()+
                "\nEmployee PhoneNo:-"+pension.getPhone()
                +"\nEmployee Age:-"+pension.getAge()+
                "\nEmployee Balance:-"+pension.getBalanceamount()
                +"\nEmployee Pension Status:-"+pension.getPensionstatus()
                +"\nEmployee Installment:-"+pension.getInstallment()
                +"\nEmployee Pension month:-"+pension.getPensionMMYY();

        //return "Employee details :-" + pensionRepository.findById(id).get();

    }

    //issuePension to all applicants with empStatus R and PensionStatus Y
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
