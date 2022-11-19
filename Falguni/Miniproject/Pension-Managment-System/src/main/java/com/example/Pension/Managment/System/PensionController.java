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
    Pension store(@RequestBody final Pension pension)
    {
        return pensionService.save(pension);
    }

    @GetMapping("/checkStatus/{id}")
    public String checkStatus(@PathVariable int id)
    {
        return pensionService.checkStatus(id);

    }

    // to retrive by id
    /**@GetMapping("/checkStatus/{id}")
    public Pension checkStatus(@PathVariable int id)
    {
      return pensionRepository.findById(id).get();

    }**/

    @GetMapping("/checkBalance/{id}")
    public String checkBalance(@PathVariable int id)
    {

        return pensionService.checkBalance(id);
    }

    @GetMapping("/checkApplication/{id}")
    public Pension getApplicant(@PathVariable("id") int id)
    {
        return pensionService.checkApplication(id);
    }


    /*
    @PutMapping("/update/PensionName/{id}")
    public @ResponseBody Pension updatePensionName(@RequestBody Pension pension, @PathVariable int id){
        Optional<Pension> pensionOptional=  pensionRepository.findById(id);
        pension.setId(id);
        pensionRepository.save(pension);
        return pensionRepository.get();
*/


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
    /**@DeleteMapping("remove/PensionName/{id}")
    public void deletePensionName(@PathVariable int id){
        pensionRepository.deleteById(id);
    }**/




















}

