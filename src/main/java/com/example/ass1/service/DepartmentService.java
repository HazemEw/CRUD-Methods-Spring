package com.example.ass1.service;

import com.example.ass1.module.Department;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DepartmentService {
    List<Department> departmentList = new ArrayList<>();
    public List<Department> getDepartment() {
        return departmentList;
    }

    public Department addDepartment(Department department) {
        departmentList.add(department);
        return department;
    }

    public Department deleteDepartment(Integer id) {
        for (int i = 0; i < departmentList.size(); i++) {
            if (departmentList.get(i).getDepartmentId() == id){
                Department department = departmentList.get(i);
                departmentList.remove(department);
                return department;
            }
        }
        return null;
    }

    public Department editDepartment(Department department, Integer id) {
        for (int i =0 ; i<departmentList.size();i++){
            if (departmentList.get(i).getDepartmentId()==id){
                if (department.getHod()!=null) {
                    departmentList.get(i).setHod(department.getHod());
                    return departmentList.get(i);
                }
            }
        }
        return null;
    }
}
