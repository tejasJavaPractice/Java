package com.jpa.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.jpa.annotation.entity.Course;
import com.jpa.annotation.entity.Instructor;
import com.jpa.annotation.service.CourseService;
import com.jpa.annotation.service.InstructorService;

@SpringBootApplication
public class JpaAnnotationsApplication implements CommandLineRunner 
{
	@Autowired
	private ApplicationContextProvider applicationContextProvider;

	public static void main(String[] args) 
	{
		SpringApplication.run(JpaAnnotationsApplication.class, args);
	}

	@Override
	public void run(String...args) throws Exception 
	{
		InstructorService instructorService = applicationContextProvider.getApplicationContext().getBean(InstructorService.class);

		//InstructorDetailService instructorDetailService = applicationContextProvider.getApplicationContext().getBean(InstructorDetailService.class);

		CourseService courseService = applicationContextProvider.getApplicationContext().getBean(CourseService.class);
		
		Instructor instructor = new Instructor("Tejas", "Jethva", "tejasmjethva@gmail.com");
		//InstructorDetail instructorDetail = new InstructorDetail("http://www.youtube.com", "Java");

		//instructorDetail.setInstructor(instructor);
		//instructor.setInstructorDetail(instructorDetail);

		instructor = instructorService.saveOrUpdateInstructor(instructor);
		//instructorDetailService.saveOrUpdateInstructorDetail(instructorDetail);

		Course course1 = new Course("Jpa");
		course1.setInstructor(instructor);
		courseService.saveOrUpdateCourse(course1);

		Course course2 = new Course("Hibernate");
		course2.setInstructor(instructor);
		courseService.saveOrUpdateCourse(course1);
	}
}
