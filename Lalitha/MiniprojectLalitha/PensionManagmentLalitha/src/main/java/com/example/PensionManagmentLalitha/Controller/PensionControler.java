package com.example.PensionManagmentLalitha.Controller;


import com.example.PensionManagmentLalitha.Model.Pension;
import com.example.PensionManagmentLalitha.Repository.PensionRepository;
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
        return "Hello Lalitha";
    }
}
