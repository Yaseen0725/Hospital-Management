package com.example.Hospital.Management.Repository;

import com.example.Hospital.Management.Models.Nurse;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;

@Repository
public class NurseRepository {
    HashMap<Integer, Nurse> NurseDb = new HashMap<>();

    public String addNurse(Nurse nurse) {

        int key = nurse.getNurseId();
        NurseDb.put(key, nurse);
        return "Nurse added successfully";
    }

    public List<Nurse> getAllNurses() {
        return NurseDb.values().stream().toList();
    }
}
