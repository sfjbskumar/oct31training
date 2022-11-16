package com.example.PensionManagementSystem.Controller;

import com.example.PensionManagementSystem.Repository.PensionRepository;
import com.example.PensionManagementSystem.Service.PensionService;
import com.example.PensionManagementSystem.model.Pension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class PensionController {

    @Autowired
    PensionRepository pensionRepository;
    @Autowired
    PensionService pensionService;


    // sample check
    @GetMapping("hii")
    public String sayHi() {
        return "Hello";
    }


    // Create new applicant for pension management by admin
    @PostMapping("/create/applicant")
    public @ResponseBody
    String store(@RequestBody final Pension pension) {

        return pensionService.save(pension);
    }


    // Check balance of particular applicant by id
    @GetMapping("checkBalance/{id}")
    public String checkBalance(@PathVariable int id) {

        return pensionService.checkBalance(id);
    }


    // Check application of particular applicant by id
    @GetMapping("checkApplication/{id}")
    public String checkApplication(@PathVariable int id) {

        return pensionService.checkApplication(id);
    }


    // Check status of particular applicant by id
    @GetMapping("checkStatus/{id}")
    public String checkStatus(@PathVariable int id) {

        return pensionService.checkStatus(id);
    }


    // Issue pension of applicant if applicant is eligible
    @GetMapping("/issuePension")
    public void issuePension() {
        pensionService.issuePension();

    }


    // Load pension of applicant if applicant is eligible
    @GetMapping("/loadPension")
    public void loadPension() {
        pensionService.loadPension();

    }

}