package com.jpa.annotation.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jpa.annotation.entity.InstructorDetail;
import com.jpa.annotation.repository.InstructorDetailsRepository;
import com.jpa.annotation.service.InstructorDetailService;

@Service
public class InstructorDetailImpl implements InstructorDetailService
{
	@Autowired
	private InstructorDetailsRepository instructorDetailsRepository;
	
	@Override
	public void saveOrUpdateInstructorDetail(InstructorDetail instructorDetail) 
	{
		instructorDetailsRepository.save(instructorDetail);
	}

	@Override
	public InstructorDetail getInstructorDetail(long id) 
	{
		return instructorDetailsRepository.findById(id).get();
	}
}
