package com.example.Pension.Managment.System;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class PensionController {

    @Autowired
    PensionRepository pensionRepository;

    // to create applicant in pension
    @PostMapping("/create/applicant")
    public @ResponseBody
    String store(@RequestBody final Pension pension)
    {
        pensionRepository.save(pension);
        return "created";
    }

    // to retrive by id
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


    /*
    @PutMapping("/update/PensionName/{id}")
    public @ResponseBody Pension updatePensionName(@RequestBody Pension pension, @PathVariable int id){
        Optional<Pension> pensionOptional=  pensionRepository.findById(id);
        pension.setId(id);
        pensionRepository.save(pension);
        return pensionRepository.get();
*/

    @DeleteMapping("remove/PensionName/{id}")
    public void deletePensionName(@PathVariable int id){
        pensionRepository.deleteById(id);
    }




















}

