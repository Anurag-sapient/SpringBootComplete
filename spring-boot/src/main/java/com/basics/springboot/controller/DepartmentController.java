package com.basics.springboot.controller;

import com.basics.springboot.entity.Department;
import com.basics.springboot.error.DepartmentNotFoundException;
import com.basics.springboot.service.DepartmentService;
import com.basics.springboot.service.DepartmentServiceImp;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class DepartmentController {

    private final Logger LOGGER = LoggerFactory.getLogger(Department.class);

    //object created
    @Autowired
    private DepartmentService departmentService;

    //save department
    @PostMapping("/savedepartments")
    public Department saveDepartment(@Valid @RequestBody Department department){
        //to get logs in console
        LOGGER.info("we are inside post mapping of save department");
        //interface <-- class
        DepartmentService service = new DepartmentServiceImp();
        return departmentService.saveDepartment(department);

    }
    @GetMapping("/alldepartments")
    public List<Department> getDepartments(){
        return departmentService.getDepartments();
    }

    @GetMapping("/getdepartments/{id}")
    public Department getDepartmentsById(@PathVariable("id") Long departmentId) throws DepartmentNotFoundException {
        return departmentService.getDepartmentsById(departmentId);
    }
    @DeleteMapping("/deletedepartments/{id}")
    public String deleteDepartmentsById(@PathVariable("id") Long departmentId){
        departmentService.deleteDepartmentsById(departmentId);
        return "department deleted successfully";
    }
    @PutMapping("/updatedepartments/{id}")
    public Department updateDepartmentsById(@PathVariable("id") Long departmentId,@RequestBody Department department){
        return departmentService.updateDepartmentsById(departmentId,department);
    }

    @GetMapping("/getbyparameter/{name}")
    public Department getByName(@PathVariable("name") String name){
        return departmentService.getByName(name);
    }


}
