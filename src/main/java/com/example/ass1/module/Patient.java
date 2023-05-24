package com.example.ass1.module;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Patient {
    private int patientId;
    private String name;
    private String gender;
    private String history;
    private Date dob;

}
