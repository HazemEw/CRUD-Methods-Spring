package com.example.ass1.controller;

import com.example.ass1.module.Appointment;
import com.example.ass1.service.DoctorService;
import com.example.ass1.module.Doctor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/doctor")

public class DoctorController {
    @Autowired
    private DoctorService doctorService ;

    @GetMapping("/get-all-doctor")
    public  List <Doctor> getAllDoctors(){
        return doctorService.getAllDoctors();
    }

    @PostMapping("/add-doctor")
    public Doctor addDoctor(@RequestBody Doctor doctor){
        return doctorService.addDoctor(doctor);
    }
    @DeleteMapping("/delete-doctor/{id}")
    public Doctor deleteDoctor(@PathVariable("id") Integer id){
        return doctorService.deleteDoctor(id);
    }
    @PutMapping("/edit-doctor/{id}")
    public Doctor editDoctor(@RequestBody Doctor doctor, @PathVariable("id") Integer id){
        return doctorService.editDoctor(doctor,id);
    }
}
