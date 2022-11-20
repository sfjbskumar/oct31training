package com.example.pensionManagementSystem;
import com.example.pensionManagementSystem.Pension;
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

    // to show status by id
    @GetMapping("/checkStatus/{id}")
    public String checkStatus(@PathVariable int id)
    {
        return pensionService.checkStatus(id);
    }

    // to show balance by id
    @GetMapping("/checkBalance/{id}")
    public String checkBalance(@PathVariable int id)
    {
        return pensionService.checkBalance(id);
    }

    //to show applican detail by id
    @GetMapping("/checkApplication/{id}")
    public Pension getApplicant(@PathVariable("id") int id)
    {
        return pensionService.getApplicantById(id);
    }

    //to issue pension
    @GetMapping("/issuePension")
    public void issuePension()
    {
        pensionService.issuePension();
    }

    //to load pension
    @GetMapping("/loadPension")
    public void loadPension()
    {
        pensionService.loadPension();
    }


    //to delete by id
   /* @DeleteMapping("remove/PensionName/{id}")
    public void deletePensionName(@PathVariable int id){
        pensionRepository.deleteById(id);
    }*/

}