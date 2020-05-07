package com.jpa.annotation.service;

import com.jpa.annotation.entity.Course;

public interface CourseService 
{
	void saveOrUpdateCourse(Course course);
	
	void deleteCourse(long id);

	Course getCourse(long id);
}
