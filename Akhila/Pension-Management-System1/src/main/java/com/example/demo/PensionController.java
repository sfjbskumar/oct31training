package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class PensionController {
    @Autowired
    PensionRepository pensionRepository;
    @Autowired
    PensionService pensionService;


    @GetMapping("checkbalance/{id}")
    public String checkBalance(@PathVariable int id) {

        return pensionService.checkBalance(id);


    }

    @GetMapping("checkapplication/{id}")
    public PensionManagemetSys checkApplication(@PathVariable int id) {

        return pensionService.getApplicantById(id);
    }

    @GetMapping("checkstatus/{id}")
    public String checkStatus(@PathVariable int id) {

        return pensionService.checkStatus(id);
    }

    @PostMapping("create/applicant")
    public @ResponseBody
    PensionManagemetSys store(@RequestBody final PensionManagemetSys pension) {
        return pensionService.save(pension);
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


    //@DeleteMapping("remove/PensionName/{id}")
    //public void deletePensionName(@PathVariable int id){
    //pensionRepository.deleteById(id);
//}


}
