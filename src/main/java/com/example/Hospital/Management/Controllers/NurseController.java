package com.example.Hospital.Management.Controllers;

import com.example.Hospital.Management.Models.Nurse;
import com.example.Hospital.Management.Services.NurseService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/nurse")
public class NurseController {
    NurseService nurseService = new NurseService();

    @PostMapping("/add")
    public String addNurse(@RequestBody Nurse nurse) {
        String ans = nurseService.addNurse(nurse);
        return ans;
    }

    @GetMapping("/getByAge")
    public List<Nurse> getNursesGreaterThanAge(@RequestParam("age") Integer age) {
        List<Nurse> nurseList = nurseService.getList(age);
        return nurseList;
    }

    @GetMapping("/getByQualification")
    public List<Nurse> getNursesByQualification(@RequestParam("qualification") String qualification) {
        List<Nurse> nurses = nurseService.getNursesWithQualification(qualification);
        return nurses;
    }
}
