package com.example.ass1.controller;

import com.example.ass1.module.Department;
import com.example.ass1.module.Patient;
import com.example.ass1.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/department")
public class DepartmentController {
    @Autowired
    DepartmentService departmentService;

    @GetMapping("/get-all-department")
    public List<Department> getDepartment(){
        return departmentService.getDepartment();
    }
    @PostMapping("/add-department")
    public Department addPatient(@RequestBody Department department){
        return departmentService.addDepartment(department);
    }
    @DeleteMapping("/delete-department/{id}")
    public Department deleteDepartment(@PathVariable("id") Integer id){
        return departmentService.deleteDepartment(id);
    }

    @PutMapping("/edit-department/{id}")
    public Department editDepartment(@RequestBody Department department , @PathVariable("id") Integer id){
        return departmentService.editDepartment(department,id);
    }
}
