package com.example.PensionManagementSystem.Controller;

import com.example.PensionManagementSystem.PensionRepository;
import com.example.PensionManagementSystem.model.Pension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class PensionController{

    @Autowired
    PensionRepository pensionRepository;

    @GetMapping("checkbalance/{id}")
    public Pension checkbalance(@PathVariable int id) {
        return pensionRepository.findById(id).get();
    }

    @GetMapping("checkapplication/{id}")
    public Pension checkapplication(@PathVariable int id) {
        return pensionRepository.findById(id).get();
    }

    @GetMapping("checkstatus/{id}")
    public Pension checkstatus(@PathVariable int id) {
        return pensionRepository.findById(id).get();
    }

    @PostMapping("/create/applicant")
    public void SavePension(@RequestBody Pension pension) {
        pensionRepository.save(pension);
    }

    // @PostMapping("/create/applicant")
    //public @ResponseBody
    //String store(@RequestBody final Pension pension)
    //{
        //pensionRepository.save(pension);
        //return "saved";
    //}

    @GetMapping("hii")
    public String sayHi() {
        return "Hello";
    }

}