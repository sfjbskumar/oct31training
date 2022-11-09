package com.student.app;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class StudentController {

    public Map<String,Student> studentMap= new HashMap<String,Student>();


    @GetMapping("/get/student")
    public Student getStudent(@RequestParam String name){
        Student result= studentMap.get(name);
        if (result == null) {
            Student student= new Student("roll1","test","2nd");
            return student;
        }else
        return result;
    }
    @PostMapping("save/student")
    public Student SaveStudent(@RequestBody Student student){
        String name= student.getName();
        studentMap.put(name,student);
        return student;
    }
    @PutMapping("update/student")
    public Student updateStudent(@RequestParam String name,@RequestParam String std){
        Student result= studentMap.get(name);
        if (result == null) {
            Student student= new Student("roll1",name,"2nd");
            student.setStd(std);
            studentMap.put(name,student);
            return student;
        }else {
            result.setStd(std);
            studentMap.put(name, result);
            return result;
        }

    }
    @DeleteMapping("remove/student")
    public String deleteStudent(@RequestParam String name){
        studentMap.remove(name);
        return name;
    }
}
