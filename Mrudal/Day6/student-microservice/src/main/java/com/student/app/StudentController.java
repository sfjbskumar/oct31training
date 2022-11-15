package com.student.app;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class StudentController {

    private Map<String,Student> studentMap= new HashMap<String,Student>();

    @GetMapping("/get/student")
    public Student getStudent(@RequestParam String name){
        Student result= studentMap.get(name);
        return result;
    }

    @GetMapping("/get/all")
    public Map<String,Student> getStudent(){
        return studentMap;
    }

    @PostMapping("save/student")
    public void SaveStudent(@RequestBody Student student){
        String name= student.getName();
        studentMap.put(name,student);
    }
    @PutMapping("update/student")
    public Student updateStudent(@RequestParam String name,@RequestParam String std){
        Student result= studentMap.get(name);
        result.setStd(std);
        studentMap.put(name,result);
        return result;

    }
    @DeleteMapping("remove/student")
    public void deleteStudent(@RequestParam String name){
        studentMap.remove(name);
    }
}
