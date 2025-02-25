package com.example.Hospital.Management.Controllers;

import com.example.Hospital.Management.Models.Doctor;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
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

    @GetMapping("/getById")
    public Doctor getById(@RequestParam("doctorId") Integer doctorId) {
        return DoctorDb.get(doctorId);
    }

    @GetMapping("/getAll")
    public List<Doctor> getAllDoctors() {
        return new ArrayList<>(DoctorDb.values());
    }
}
