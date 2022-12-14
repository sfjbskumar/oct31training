package com.example.pensionmanagement.controller.pensionmanagement;


import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.HashMap;
import java.util.Map;

@RestController
public class PensionController {

    private Map<String, Pension> pensionMap=new HashMap<String, Pension>();
    @GetMapping("/get/PensionUserName")
    public Pension getUserByName(@RequestParam String name){
        Pension result=pensionMap.get(name);
        return result;
    }
    @GetMapping("/get/all")
    public Map<String, Pension> getAllUsers(){

        return pensionMap;
    }
    @PostMapping("save/pension")
    public void SavePension(@RequestBody Pension pension){
        String name = pension.getName();
        pensionMap.put(name,pension);
    }
    @PutMapping("update/pension")
    public Pension updatePensionUser(@RequestParam String name,@RequestParam Integer balance_amount){
        Pension result=pensionMap.get(name);
        result.setBalance_amount(balance_amount);
        pensionMap.put(name,result);
        return result;
    }
    @DeleteMapping("remove/pension")
    public void removePensionUser(@RequestParam String name){
        pensionMap.remove(name);
    }
    @GetMapping("/hi")
    public String sayhi()
    {
        return "hi";
    }


}