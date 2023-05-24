package com.example.ass1.controller;
import com.example.ass1.module.Doctor;
import  com.example.ass1.service.PatientService;
import  com.example.ass1.module.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/patient")
public class PatientController {
    @Autowired
    private PatientService patientService;

    @GetMapping("/get-all-patient")
    public List<Patient> getPatient(){
        return patientService.getPatints();
    }

    @PostMapping("/add-patient")
    public Patient addPatient(@RequestBody Patient patient){
        return patientService.addPatient(patient);
    }
    @DeleteMapping("/delete-patient/{id}")
    public Patient deletePatient(@PathVariable("id") Integer id){
        return patientService.deletePatient(id);
    }
    @PutMapping("/edit-patinet/{id}")
    public Patient editPatinet(@RequestBody Patient patient , @PathVariable("id") Integer id){
        return patientService.editPatient(patient,id);
    }
}
