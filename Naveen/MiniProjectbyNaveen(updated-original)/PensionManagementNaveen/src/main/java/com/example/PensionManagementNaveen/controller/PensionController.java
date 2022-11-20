 package com.example.PensionManagementNaveen.controller;

import com.example.PensionManagementNaveen.PensionManagementNaveenApplication;
import com.example.PensionManagementNaveen.model.Pension;

import com.example.PensionManagementNaveen.repository.PensionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;



@RestController
public class PensionController {
    @Autowired
    PensionRepository pensionRepository;


    @PostMapping("/create/applicant")
    public @ResponseBody
    String store(@RequestBody final Pension pension)
    {
        pensionRepository.save(pension);
        return "saved";
    }
    @GetMapping("/checkStatus/{id}")
    public Pension checkStatus(@PathVariable int id)
    {
        return pensionRepository.findById(id).get();

    }
    @GetMapping("/checkBalance/{id}")
    public Pension checkBalance(@PathVariable int id)
    {

        return pensionRepository.findById(id).get();
    }
    @GetMapping("/checkApplication/{id}")
    public Pension getName(@PathVariable int id)
    {
        return pensionRepository.findById(id).get();
    }
    @DeleteMapping("remove/PensionName/{id}")
    public void deletePensionName(@PathVariable int id){
        pensionRepository.deleteById(id);
    }


    @GetMapping("hii")
    public String sayHi(){
        return "Hello Naveen";
    }


}
