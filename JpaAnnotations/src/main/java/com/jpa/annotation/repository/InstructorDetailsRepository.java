package com.jpa.annotation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jpa.annotation.entity.InstructorDetail;

@Repository
public interface InstructorDetailsRepository extends JpaRepository<InstructorDetail, Long>
{

}
