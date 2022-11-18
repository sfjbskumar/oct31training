 package com.example.PensionManagementNaveen.controller;
import com.example.PensionManagementNaveen.model.Pension;
import com.example.PensionManagementNaveen.repository.PensionRepository;
import com.example.PensionManagementNaveen.service.PensionService;
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
    Pension store(@RequestBody final Pension pension) {
        return pensionService.save(pension);
    }

    // to retrive by id
    @GetMapping("/checkStatus/{id}")
    public String checkStatus(@PathVariable int id) {
        return pensionService.checkStatus(id);

    }

    @GetMapping("/checkBalance/{id}")
    public String checkBalance(@PathVariable int id) {
        return pensionService.checkBalance(id);
    }

    @GetMapping("/checkApplication/{id}")
    public Pension checkApplication(@PathVariable int id) {
        return pensionService.getApplicantById(id);
    }

    @GetMapping("/issuePension")
    public void issuePension() {
        pensionService.issuePension();
    }

    @GetMapping("/loadPension")
    public void loadPension() {
        pensionService.loadPension();
    }




   /* @DeleteMapping("remove/PensionName/{id}")
    public void deletePensionName(@PathVariable int id){
        pensionRepository.deleteById(id);
    }*/
}
