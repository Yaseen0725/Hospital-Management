package com.example.Hospital.Management;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
public class PatientController {
    HashMap<Integer, Patient> PatientDb = new HashMap<>();
    @PostMapping("/addPatientViaParameters")
    public String addPatientInfo(@RequestParam("PatientId") Integer patientId, @RequestParam("name") String name,
                                 @RequestParam("age") Integer age, @RequestParam("disease") String disease){
//        Create object
        Patient patient = new Patient(patientId, name, age, disease);
        PatientDb.put(patientId, patient);
        return "Patient Added via request param";
    }
    @PostMapping("/addPatientViaRequestBody")
    public String addPatientInfo(@RequestBody Patient patient){
        int key = patient.getPatientId();
        PatientDb.put(key, patient);
        return "Patient Added via request body";
    }
}
