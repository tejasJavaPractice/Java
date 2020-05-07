package com.jpa.annotation.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jpa.annotation.entity.Course;
import com.jpa.annotation.repository.CourseRepository;
import com.jpa.annotation.service.CourseService;

@Service
public class CourseServiceImpl implements CourseService 
{
	@Autowired
	private CourseRepository courseRepository;
	
	@Override
	public void saveOrUpdateCourse(Course course) 
	{
		courseRepository.save(course);
	}

	@Override
	public void deleteCourse(long id) 
	{
		courseRepository.deleteById(id);
	}

	@Override
	public Course getCourse(long id) 
	{
		return courseRepository.findById(id).get();
	}
}
