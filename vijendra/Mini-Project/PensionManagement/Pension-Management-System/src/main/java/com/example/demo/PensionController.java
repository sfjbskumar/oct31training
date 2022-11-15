package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class PensionController {
    @Autowired
    PensionRepository pensionRepository;

    @GetMapping("/")
    public String hello(){
        return "<h1>Pension Management System</h1>";
    }
    @GetMapping("checkbalance/{id}")
    public Pension checkbalace(@PathVariable int id) {

        return pensionRepository.findById(id).get();

    }

    @GetMapping("checkapplication/{id}")
    public Pension checkapplication(@PathVariable int id) {

        return pensionRepository.findById(id).get();
    }

    @GetMapping("checkstatus/{id}")
    public Pension getName(@PathVariable int id) {

        return pensionRepository.findById(id).get();
    }

    @PostMapping("create/applicant")
    public void SavePensionManagemetSys(@RequestBody Pension pen) {
        pensionRepository.save(pen);
    }



}
