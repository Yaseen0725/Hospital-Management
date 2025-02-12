package com.example.Hospital.Management;

import com.example.Hospital.Management.Doctor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.HashMap;
@RestController
@RequestMapping("/doctor")
public class DoctorController {
    HashMap<Integer, Doctor> DoctorDb = new HashMap<>();

    @PostMapping("/add")
    public String addDoctor(@RequestBody Doctor doctor) {
        int doctorId = doctor.getDoctorId();
        DoctorDb.put(doctorId, doctor);
        return "Doctor added successfully";
    }
}
