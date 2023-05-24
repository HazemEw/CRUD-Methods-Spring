package com.example.ass1.service;

import com.example.ass1.module.Doctor;
import com.example.ass1.module.Patient;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;
@Service
public class PatientService {
    List<Patient> patients = new ArrayList<>();
    public List<Patient> getPatints() {
        return patients;
    }

    public Patient addPatient(Patient patient) {
        patients.add(patient);
        return patient;
    }

    public Patient deletePatient(Integer id) {
        for (int i = 0; i < patients.size(); i++) {
            if (patients.get(i).getPatientId() == id){
                Patient patient = patients.get(i);
                patients.remove(patient);
                return patient;
            }
        }
        return null;
    }

    public Patient editPatient(Patient patient, Integer id) {
        for (int i =0 ; i<patients.size();i++){
            if (patients.get(i).getPatientId()==id){
                if (patient.getHistory()!=null) {
                    patients.get(i).setHistory(patient.getHistory());
                    return patients.get(i);
                }
            }
        }
        return null;
    }
}
