package com.example.ass1.service;

import com.example.ass1.module.Appointment;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AppointmentService {

    List<Appointment> appointments = new ArrayList<>();
    public List<Appointment> getAppointments() {
        return appointments;
    }

    public Appointment addAppoinment(Appointment appointment) {

        appointments.add(appointment);
        return appointment;

    }

    public Appointment deleteAppointment(Integer id) {

        for (int i = 0; i < appointments.size(); i++) {
             if (appointments.get(i).getAppointmentId() == id){
                 Appointment appointment = appointments.get(i);
                 appointments.remove(appointment);
                 return appointment;
             }
        }
        return null;
    }

    public Appointment editAppointment(Appointment appointment, Integer id) {

        for (int i = 0; i < appointments.size(); i++) {

            if (appointments.get(i).getAppointmentId() == id){
                if (appointment.getDoctorId() != null){
                    appointments.get(i).setDoctorId(appointment.getDoctorId());
                }
                if (appointment.getPatientId() != null){
                    appointments.get(i).setPatientId(appointment.getPatientId());
                }
                return appointments.get(i);
            }



        }

        return null;

    }
}
