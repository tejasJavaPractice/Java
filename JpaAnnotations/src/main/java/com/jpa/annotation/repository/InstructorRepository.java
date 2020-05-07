package com.jpa.annotation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jpa.annotation.entity.Instructor;

@Repository
public interface InstructorRepository extends JpaRepository<Instructor, Long>
{

}
