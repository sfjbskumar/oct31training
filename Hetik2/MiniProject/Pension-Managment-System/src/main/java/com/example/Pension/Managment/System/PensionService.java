package com.example.Pension.Managment.System;

import org.springframework.stereotype.Service;

@Service
public class PensionService {
<<<<<<< HEAD
    @Autowired
    PensionRepository pensionRepository;


    public Pension save(Pension pension)
    {
        return  pensionRepository.save(pension);

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
        Pension pension= new Pension();
        pension = pensionRepository.findById(id).get();
        pension.getBalance();
        return "Employee Balance is:-"+pension.getBalance();
    }

    public Pension getApplicantById(int id)
    {
        return pensionRepository.findById(id).get();
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



=======
>>>>>>> c0b1252828a63b854ebb4f0f0734331135c5d619
}
