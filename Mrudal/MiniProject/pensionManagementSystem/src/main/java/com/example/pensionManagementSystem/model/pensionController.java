package com.example.pensionManagementSystem.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;



import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class pensionController {

    @Autowired
    PensionRepository pensionRepository;


    @GetMapping("/checkStatus/{id}")
    public Pension checkStatus(@PathVariable int id) {
        return (Pension) pensionRepository.findById(id).get();

    }

    @GetMapping("/checkBalance/{id}")
    public Pension checkBalance(@PathVariable int id) {

        return (Pension) pensionRepository.findById(id).get();
    }

    @GetMapping("/checkApplication/{id}")
    public Pension getName(@PathVariable int id) {
        return (Pension) pensionRepository.findById(id).get();
    }

    @PostMapping("create/applicant")
    public void SavePension(@RequestBody Pension pension) {
        pensionRepository.save(pension);
    }

    @DeleteMapping("remove/PensionName/{id}")
    public void deletePensionName(@PathVariable int id){
        pensionRepository.deleteById(id);
    }
}

