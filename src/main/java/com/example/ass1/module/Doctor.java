package com.example.ass1.module;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data

@AllArgsConstructor
@NoArgsConstructor

public class Doctor {
    private int doctorId;
    private String name;
    private String email;
    private Boolean available;

}
