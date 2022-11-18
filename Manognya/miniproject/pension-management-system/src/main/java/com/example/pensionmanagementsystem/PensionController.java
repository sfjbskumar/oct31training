package com.example.pensionmanagementsystem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class PensionController {

    @Autowired
    PensionRepository pensionRepository;
    @Autowired
    PensionService pensionService;
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
    @GetMapping("/checkBalance/{id}")
    public String checkBalance(@PathVariable int id)
    {
        return pensionService.checkBalance(id);
    }
    @GetMapping("/checkApplication/{id}")
    public Pension getApplicant(@PathVariable("id") int id)
    {
        return pensionService.getApplicantById(id);
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


}
