package com.example.PMS;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class PensionController {
    private Map<String, Pension> PenMap= new HashMap<String, Pension>();

    @GetMapping("/get/pension")
    public Pension getPensionManagemetSys(@RequestParam String name){
        Pension result= PenMap.get(name);
        return result;
    }

    @GetMapping("get/all")
    public Map<String, Pension> getName(){
        return PenMap;
    }

    @PostMapping("save/pension")
    public void SavePensionManagemetSys(@RequestBody Pension pen){
        String name= pen.getName();
        PenMap.put(name,pen);
    }
    @PutMapping("update/pension")
    public Pension updateStudent(@RequestParam String name, @RequestParam Integer balanceamount){
        Pension result= PenMap.get(name);
        result.setBalanceamount(balanceamount);
        PenMap.put(name,result);
        return result;

    }
    @DeleteMapping("remove/pension")
    public void deleteStudent(@RequestParam String name){
        PenMap.remove(name);
    }
}
