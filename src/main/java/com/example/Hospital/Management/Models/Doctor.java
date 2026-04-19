package com.example.Hospital.Management.Models;


import lombok.*;

@Data
@AllArgsConstructor  //Generates a constructor with all fields (attributes) of the class
@NoArgsConstructor   // Generates a constructor with no parameters (default constructor)
public class Doctor {
    private int doctorId;
    private String name;
    private String specialization;
    private int age;
    private String degree;
}
