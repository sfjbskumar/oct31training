package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class PensionController {
    @Autowired
    PensionRepository pensionRepository;


    @GetMapping("checkbalance/{id}")
    public PensionManagemetSys checkbalace(@PathVariable int id) {

        return pensionRepository.findById(id).get();


    }

    @GetMapping("checkapplication/{id}")
    public PensionManagemetSys checkapplication(@PathVariable int id) {

        return pensionRepository.findById(id).get();
    }

    @GetMapping("checkstatus/{id}")
    public PensionManagemetSys getName(@PathVariable int id) {

        return pensionRepository.findById(id).get();
    }

    @PostMapping("create/applicant")
    public void SavePensionManagemetSys(@RequestBody PensionManagemetSys pen) {
        pensionRepository.save(pen);
    }



}
