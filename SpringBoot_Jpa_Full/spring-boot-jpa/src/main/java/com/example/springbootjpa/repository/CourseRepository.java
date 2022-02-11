package com.example.springbootjpa.repository;

import com.example.springbootjpa.entity.Course;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.net.ContentHandler;
import java.util.List;

@Repository
public interface CourseRepository extends JpaRepository<Course,Long> {
//    ContentHandler findByTitleContaining(String d, Pageable firstPageTenRecords);

    Page<Course> findByTitleContaining(
            String title,
            Pageable pageable);
}