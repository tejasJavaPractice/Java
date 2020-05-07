package com.jpa.annotation.service;

import com.jpa.annotation.entity.Employee;

public interface EmployeeService 
{
	void saveOrUpdateEmployee(Employee employee);
	
	void deleteEmployee(long id);

	Employee getEmployee(long id);
}
