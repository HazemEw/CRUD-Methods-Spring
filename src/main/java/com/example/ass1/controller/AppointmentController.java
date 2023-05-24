package com.example.ass1.controller;

import com.example.ass1.module.Appointment;
import com.example.ass1.service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/appointment")
public class AppointmentController {

    @Autowired
    private AppointmentService appointmentService;

    @GetMapping("/get-all-appoinment")
    public List<Appointment> getAppointments(){

        return appointmentService.getAppointments();
    }

    @PostMapping("/add-appointment")
    public Appointment addAppointment(@RequestBody Appointment appointment){
        return appointmentService.addAppoinment(appointment);
    }

    @DeleteMapping("/delete-appointment/{id}")
    public Appointment deleteAppointment(@PathVariable("id") Integer id){
        return appointmentService.deleteAppointment(id);
    }

    @PutMapping("/edit-appointment/{id}")
    public Appointment editAppointment(@RequestBody Appointment appointment, @PathVariable("id") Integer id){
        return appointmentService.editAppointment(appointment, id);
    }
}
