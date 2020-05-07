package com.jpa.annotation.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jpa.annotation.entity.Instructor;
import com.jpa.annotation.repository.InstructorRepository;
import com.jpa.annotation.service.InstructorService;

@Service
public class InstructorServiceImpl implements InstructorService
{
	@Autowired
	private InstructorRepository instructorRepository;
	
	@Override
	public Instructor saveOrUpdateInstructor(Instructor instructor) 
	{
		return instructorRepository.save(instructor);
	}

	@Override
	public void deleteInstructor(long id) 
	{
		instructorRepository.deleteById(id);
	}

	@Override
	public Instructor getInstructor(long id) 
	{
		return instructorRepository.findById(id).get();
	}
}
