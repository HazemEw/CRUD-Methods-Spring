package com.example.ass1.module;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Department {
        private  int departmentId;
        private String name;
        private String hod;
}
