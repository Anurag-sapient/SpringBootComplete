package com.basics.springboot.service;

import com.basics.springboot.entity.Department;
import com.basics.springboot.error.DepartmentNotFoundException;
import com.basics.springboot.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class DepartmentServiceImp implements DepartmentService{

    //object created
    @Autowired
    private DepartmentRepository departmentRepository;

    @Override
    public Department saveDepartment(Department department) {
        return departmentRepository.save(department);
    }

    @Override
    public List<Department> getDepartments() {
        return departmentRepository.findAll();
    }

    @Override
    public Department getDepartmentsById(Long id) throws DepartmentNotFoundException {
        Optional<Department> department = departmentRepository.findById(id);
        if(!department.isPresent()) {
            throw new DepartmentNotFoundException("Department Not Found");
        }
        return departmentRepository.findById(id).get();
    }

    @Override
    public void deleteDepartmentsById(Long departmentId) {
        departmentRepository.deleteById(departmentId);
    }

    @Override
    public Department updateDepartmentsById(Long departmentId,Department department) {
        //get() used to solve optional problem

//        if department some values not null and empty then only will be updated
        Department depUpdate = departmentRepository.findById(departmentId).get();
        depUpdate.setDepartmentName(department.getDepartmentName());
        if(Objects.nonNull(department.getDepartmentName())&&!"".equalsIgnoreCase(department.getDepartmentName())){
            depUpdate.setDepartmentName(department.getDepartmentName());
        }
        if(Objects.nonNull(department.getDepartmentCode())&&!"".equalsIgnoreCase(department.getDepartmentCode())){
            depUpdate.setDepartmentCode(department.getDepartmentCode());
        }
        if(Objects.nonNull(department.getDepartmentAddress())&&!"".equalsIgnoreCase(department.getDepartmentAddress())){
            depUpdate.setDepartmentAddress(department.getDepartmentAddress());
        }
        return departmentRepository.save(depUpdate);
    }

    @Override
    public Department getByName(String name) {
        return departmentRepository.findByDepartmentName(name);
    }

    @Override
    public Department fetchDepartmentByName(String departmentName) {
        return departmentRepository.findByDepartmentNameIgnoreCase(departmentName);
    }

}
