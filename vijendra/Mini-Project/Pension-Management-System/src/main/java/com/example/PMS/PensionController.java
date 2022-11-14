package com.example.PMS;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class PensionController {
    private Map<String,PensionManagemetSys> PenMap= new HashMap<String,PensionManagemetSys>();

    @GetMapping("/get/pension")
    public PensionManagemetSys getPensionManagemetSys(@RequestParam String name){
        PensionManagemetSys result= PenMap.get(name);
        return result;
    }

    @GetMapping("get/all")
    public Map<String,PensionManagemetSys> getName(){
        return PenMap;
    }

    @PostMapping("save/pension")
    public void SavePensionManagemetSys(@RequestBody  PensionManagemetSys pen){
        String name= pen.getName();
        PenMap.put(name,pen);
    }
    @PutMapping("update/pension")
    public  PensionManagemetSys updateStudent(@RequestParam String name,@RequestParam Integer balanceamount){
        PensionManagemetSys result= PenMap.get(name);
        result.setBalanceamount(balanceamount);
        PenMap.put(name,result);
        return result;

    }
    @DeleteMapping("remove/pension")
    public void deleteStudent(@RequestParam String name){
        PenMap.remove(name);
    }
}
