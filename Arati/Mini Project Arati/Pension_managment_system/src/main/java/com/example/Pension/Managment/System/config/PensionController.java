package com.example.Pension.Managment.System.config;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class PensionController {

    private Map<String,Pension> pensionMap= new HashMap<String,Pension>();

    @GetMapping("/get/PensionName")
    public Pension getName(@RequestParam String name){
        Pension result= pensionMap.get(name);
        return result;
    }

    @GetMapping("/get/all")
    public Map<String,Pension> getName(){
        return pensionMap;
    }

    @PostMapping("save/PensionName")
    public void SavePensionName(@RequestBody Pension pension){
        String name= pension.getName();
        pensionMap.put(name,pension);
    }
    @PutMapping("/update/PensionName")
    public Pension updatePensionName(@RequestParam String name,@RequestParam int id){
        Pension result= pensionMap.get(name);
        result.setId(id);
        pensionMap.put(name,result);
        return result;
    }


    @DeleteMapping("remove/PensionName")
    public void deletePensionName(@RequestParam String name){
        pensionMap.remove(name);
    }




















}

