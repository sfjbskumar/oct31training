package com.example.PMS.controller;

import com.example.PMS.Pension;
import com.example.PMS.repository.PensionRepository;
import com.example.PMS.service.PensionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class PensionController {
    @Autowired
    PensionRepository pensionRepository;
    @Autowired
    PensionService pensionService;

    @GetMapping("/")
    public String hello(){
        return "<h1>Pension Management System</h1><p><h2>Mini Project</h2> Created by Vijendra</p>";
    }
    //Getting JSON Data
    @GetMapping("/checkApplicationAsJSON/{id}")
    public Pension checkApplicationAsJSON(@PathVariable int id)
    {
        return pensionRepository.findById(id).get();
    }


    // To create applicant in pension
    @PostMapping("/create/applicant")
    public @ResponseBody
    Pension store(@RequestBody final Pension pension)
    {

        return pensionService.save(pension);
    }

    // To retrive by id
    @GetMapping("/checkStatus/{id}")
    public String checkStatus(@PathVariable int id)
    {
        return pensionService.checkStatus(id);
    }

    @GetMapping("/checkBalance/{id}")
    public String checkBalance(@PathVariable int id)
    {
        return pensionService.checkBalance(id);
    }

    @GetMapping("/checkApplication/{id}")
    public String checkApplication(@PathVariable int id)
    {
        return pensionService.checkApplication(id);
    }

    @GetMapping("/issuePension")
    public void issuePension()
    {
        pensionService.issuePension();
    }

    @GetMapping("/loadPension")
    public void loadPension()
    {
        pensionService.loadPension();
    }


}
