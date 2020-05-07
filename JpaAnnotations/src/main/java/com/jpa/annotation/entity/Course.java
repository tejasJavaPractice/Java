package com.jpa.annotation.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "course")
public class Course 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private long id;
	
	@Column(name = "title")
	private String title;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "instructor_id")
	private Instructor instructor;
	
	public Course() 
	{
		
	}
	
	public Course(String title) 
	{
		this.title = title;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Instructor getInstructor() {
		return instructor;
	}

	public void setInstructor(Instructor instructor) {
		if (sameAsFormer(instructor))
		{
			return;
		}
		    
		this.instructor = instructor;
		this.instructor.addCourse(this);
	}
	
	private boolean sameAsFormer(Instructor newInstructor) {
	    return instructor==null? newInstructor == null : instructor.equals(newInstructor);
	  }

	@Override
	public String toString() {
		return "Course [id=" + id + ", title=" + title + ", instructor=" + instructor + "]";
	}
	

}
