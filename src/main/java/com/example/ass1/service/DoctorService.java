package com.example.ass1.service;
import com.example.ass1.module.Appointment;
import com.example.ass1.module.Doctor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DoctorService {
    List<Doctor> doctorsList = new ArrayList<>();
    public  List<Doctor> getAllDoctors() {
        return  doctorsList;
    }

    public Doctor addDoctor(Doctor doctor) {
        doctorsList.add(doctor);
        return doctor;
    }

    public Doctor deleteDoctor(Integer id) {
        for (int i = 0; i < doctorsList.size(); i++) {
            if (doctorsList.get(i).getDoctorId() == id){
                Doctor doctor = doctorsList.get(i);
                doctorsList.remove(doctor);
                return doctor;
            }
        }
        return null;
    }

    public Doctor editDoctor(Doctor doctor, Integer id) {
        for (int i =0 ; i<doctorsList.size();i++){
            if (doctorsList.get(i).getDoctorId()==id){
                if (doctor.getAvailable()!=null) {
                    doctorsList.get(i).setAvailable(doctor.getAvailable());
                    return doctorsList.get(i);
                }
            }
        }
        return null;
    }
}
