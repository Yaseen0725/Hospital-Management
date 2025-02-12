package com.example.Hospital.Management;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@RequestMapping("/nurse")
public class NurseController {
    HashMap<Integer, Nurse> NurseDb = new HashMap<>();
    @PostMapping("add")
    public String addNurse(@RequestBody Nurse nurse){
        return "Nurse added Successfully";
    }
}
