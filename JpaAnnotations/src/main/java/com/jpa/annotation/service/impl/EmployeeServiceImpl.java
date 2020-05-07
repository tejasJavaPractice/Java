package com.jpa.annotation.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jpa.annotation.entity.Employee;
import com.jpa.annotation.repository.EmployeeRepository;
import com.jpa.annotation.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService 
{
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	public void saveOrUpdateEmployee(Employee employee) 
	{
		employeeRepository.save(employee);
	}

	@Override
	public void deleteEmployee(long id) 
	{
		employeeRepository.deleteById(id);
	}

	@Override
	public Employee getEmployee(long id)
	{
		return employeeRepository.findById(id).get();
	}

}
