package com.jpa.annotation.service;

import com.jpa.annotation.entity.Instructor;

public interface InstructorService 
{
	Instructor saveOrUpdateInstructor(Instructor instructor);

	void deleteInstructor(long id);

	Instructor getInstructor(long id);
}
