package com.jpa.annotation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jpa.annotation.entity.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long>
{

}
