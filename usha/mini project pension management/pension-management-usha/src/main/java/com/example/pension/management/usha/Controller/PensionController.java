package com.example.pension.management.usha.Controller;

import com.example.pension.management.usha.model.Pension;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class PensionController {

    private Map<String,Pension> PensionMap= new HashMap<String, Pension>();

    @GetMapping("/get/PensionUserName")
    public Pension getStudent(@RequestParam String name){
        Pension result= PensionMap.get(name);
        return result;
    }

    @GetMapping("/get/all")
    public Map<String,Pension> getAllUsers(){
        return PensionMap;
    }

    @PostMapping("save/pension")
    public void SavePensionUser(@RequestBody Pension pension){
        String name= pension.getName();
        PensionMap.put(name,pension);
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
