package com.example.PensionManagementSystem.Controller;

import com.example.PensionManagementSystem.PensionRepository;
import com.example.PensionManagementSystem.model.Pension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class PensionController {

    @Autowired
    PensionRepository pensionRepository;

    private Map<String,Pension> PensionMap= new HashMap<String, Pension>();

    @GetMapping("/get/PensionUserName")
    public Pension getPensionUser(@RequestParam String name){
        Pension result= PensionMap.get(name);
        return result;
    }

    @GetMapping("/get/all")
    public List<Pension> getName(){

        return (List<Pension>) pensionRepository.findAll();
    }

    @PostMapping("save/pension")
    public void SavePensionUser(@RequestBody Pension pension){
        pensionRepository.save(pension);
    }

    @GetMapping("hii")
    public String sayHi(){
        return "Hello";
    }
    
    @PutMapping("update/pension")
    public Pension updatePensionUser(@RequestParam String name,@RequestParam Integer balance_amount){
        Pension result= PensionMap.get(name);
        result.setBalance_amount(balance_amount);
        PensionMap.put(name,result);
        return result;

    }
    @DeleteMapping("remove/pension")
    public void deleteStudent(@RequestParam String name){
        PensionMap.remove(name);
    }
}