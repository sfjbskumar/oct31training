package com.example.demo;

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
    public PensionManagemetSys save(PensionManagemetSys pension)
    {
       return  pensionRepository.save(pension);

    }
    public String checkStatus(int id)
    {
        PensionManagemetSys pension=new PensionManagemetSys();
        pension =pensionRepository.findById(id).get();
        pension.getEmpstatus();
        pension.getPensionstatus();
       return  "Employee Status is"+pension.getEmpstatus()+" Pension Status is "+pension.getPensionstatus();
    }
    public String checkBalance(int id) {
        PensionManagemetSys pension = new PensionManagemetSys();

        pension = pensionRepository.findById(id).get();
        pension.getBalanceamount();
        return "Employee Balance is:" + pension.getBalanceamount();
    }
    public PensionManagemetSys getApplicantById(int id)
    {
        return pensionRepository.findById(id).get();
    }
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




        pensionRepository.issuePension("R","Y",currentMMYY,previousMMYY);

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
