package com.jpa.annotation.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "project")
@Setter
@Getter
public class Project 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private long id;
	
	@Column(name = "title")
	private String title;
	
	@ManyToMany(mappedBy = "projects", cascade = CascadeType.ALL)
	private Set<Employee> employees = new HashSet<>();
}
