package com.example.ass1.module;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data

@AllArgsConstructor
@NoArgsConstructor
public class Appointment {
    private int appointmentId;
    private String doctorId;
    private String patientId;

}
