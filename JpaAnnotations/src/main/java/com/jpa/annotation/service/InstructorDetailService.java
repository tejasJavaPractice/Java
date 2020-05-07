package com.jpa.annotation.service;

import com.jpa.annotation.entity.InstructorDetail;

public interface InstructorDetailService 
{
	void saveOrUpdateInstructorDetail(InstructorDetail instructorDetail);

	InstructorDetail getInstructorDetail(long id);
}
