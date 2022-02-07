package com.basics.springboot.repository;

import com.basics.springboot.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
//using key only we are trying the jpa respository which is currently department identity & type
public interface DepartmentRepository extends JpaRepository<Department,Long> {
    //if no such default function is there then we can make something like this and will now work for us similar to departById
    public Department findByDepartmentName(String departmentName);

    Department findByDepartmentNameIgnoreCase(String departmentName);


//    @Query(value = " write query here ",nativeQuery = true)
    //any query passed becomes native query and can be used to get data
}
