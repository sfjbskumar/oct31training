package com.example.Pension.Managment.System;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class PensionController {

    @Autowired
    PensionRepository pensionRepository;
    @Autowired
    PensionService pensionService;

    // to create applicant in pension
    @PostMapping("/create/applicant")
    public @ResponseBody
    String store(@RequestBody final Pension pension)
    {
        return pensionService.save(pension);
    }

    // to retrive by id
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




   /* @DeleteMapping("remove/PensionName/{id}")
    public void deletePensionName(@PathVariable int id){
        pensionRepository.deleteById(id);
    }*/




















}

