package com.jpa.annotation.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "employee")
@Setter
@Getter
public class Employee 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private long id;
	
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "employee_project",
	joinColumns = {
			@JoinColumn(name = "employee_id")
	}, 
	inverseJoinColumns = 
	{
			@JoinColumn(name = "project_id")
	})
	Set<Project> projects = new HashSet<>();
	
	
}
