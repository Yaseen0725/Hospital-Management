package com.example.Hospital.Management.Models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor  //Generates a constructor with all fields (attributes) of the class
@NoArgsConstructor   // Generates a constructor with no parameters (default constructor)
public class Nurse {
    private int nurseId;
    private String name;
    private int age;
    private String qualification;

}
