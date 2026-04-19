package com.example.Hospital.Management.Models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Nurse {
    private int nurseId;
    private String name;
    private int age;
    private String qualification;

}
