package com.example.PensionManagementSystem.Controller;


import com.example.PensionManagementSystem.model.Pension;
import com.example.PensionManagementSystem.Repository.PensionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class PensionController {
    @Autowired
    PensionRepository pensionRepository;



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
    public void SavePension(@RequestBody Pension pen) {
        pensionRepository.save(pen);

    }

    @GetMapping("hii")
    public String sayHi() {
        return "Hello Karthik";
    }

    @DeleteMapping("remove/PensionName/{id}")
    public void deletePensionName(@PathVariable int id) {
        pensionRepository.deleteById(id);
    }
}
