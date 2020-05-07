package com.jpa.annotation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jpa.annotation.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>
{

}
