package com.example.Hospital.Management;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@RestController
public class PatientController {
    HashMap<Integer, Patient> PatientDb = new HashMap<>();

    @PostMapping("/addPatientViaParameters")
    public String addPatientViaParameters(@RequestParam("patientId") Integer patientId, @RequestParam("name") String name,
                                          @RequestParam("age") Integer age, @RequestParam("disease") String disease) {
//        Create object
        Patient patient = new Patient(patientId, name, age, disease);
        PatientDb.put(patientId, patient);
        return "Patient Added via request param";
    }

    @PostMapping("/addPatientViaRequestBody")
    public String addPatientViaRequestBody(@RequestBody Patient patient) {
        int key = patient.getPatientId();
        PatientDb.put(key, patient);
        return "Patient Added via request body";
    }


    @GetMapping("/getPatientInfo")
    public Patient getPatientInfo(@RequestParam("patientId") Integer patientId) {
        Patient patient = PatientDb.get(patientId);
        return patient;
    }

    @GetMapping("/getAllPatients")
    public List<Patient> getAllPatients() {
        List<Patient> patients = new ArrayList<>();
        for (Patient p : PatientDb.values()) {
            patients.add(p);
        }
        return patients;
    }


    @GetMapping("/getPatientByName")
    public Patient getPatientByName(@RequestParam("name") String name) {
        for (Patient p : PatientDb.values()) {
            if (p.getName().equals(name)) {
                return p;
            }
        }
        return null;
    }


    @GetMapping("/getPatientsListGreaterThanAge")
    public List<Patient> getPatientsListGreaterThanAge(@RequestParam("age") Integer age) {
        List<Patient> patients = new ArrayList<>();
        for (Patient p : PatientDb.values()) {
            if (p.getAge() > age) {
                patients.add(p);
            }
        }
        return patients;
    }

    @PutMapping("/updateDisease")
    public String updateDisease(@RequestParam("patientId") Integer patientId, @RequestParam("disease") String disease) {

        if (PatientDb.containsKey(patientId)) {

            Patient patient = PatientDb.get(patientId);

            patient.setDisease(disease);

            PatientDb.put(patientId, patient);

            return "Updated successfully";
        } else {
            return "Patient does not exist";
        }
    }

    @PutMapping("/updatePatientDetails")
    public String updatePatientDetails(@RequestBody Patient patient) {

        int key = patient.getPatientId();

        if (PatientDb.containsKey(key)) {
            PatientDb.put(key, patient);
            return "Updated patient successfully";
        } else {
            return "Data was not existing";
        }
    }

    @DeleteMapping("/deletePatient")
    public String deletePatient(@RequestParam("patientId") Integer patientId) {

        PatientDb.remove(patientId);

        return "Patient deleted successfully";
    }
}
