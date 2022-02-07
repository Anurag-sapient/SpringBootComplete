package com.basics.springboot.service;

import com.basics.springboot.entity.Department;
import com.basics.springboot.error.DepartmentNotFoundException;

import java.util.List;


public interface DepartmentService {

    public Department saveDepartment(Department department);

    public List<Department> getDepartments();

   public Department getDepartmentsById(Long id) throws DepartmentNotFoundException;

    void deleteDepartmentsById(Long departmentId);

    Department updateDepartmentsById(Long departmentId,Department department);

    Department getByName(String name);

    Department fetchDepartmentByName(String departmentName);
}
