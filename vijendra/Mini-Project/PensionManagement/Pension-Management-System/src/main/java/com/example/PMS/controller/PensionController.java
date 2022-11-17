package com.example.demo.controller;

import com.example.demo.Pension;
import com.example.demo.repository.PensionRepository;
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
        return "<h1>Pension Management System</h1>";
    }
    @GetMapping("checkbalance/{id}")
    public Pension checkbalace(@PathVariable int id) {

        return pensionRepository.findById(id).get();

    }

    // To create applicant in pension
    @PostMapping("/create/applicant")
    public @ResponseBody
    String store(@RequestBody final Pension pension)
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
