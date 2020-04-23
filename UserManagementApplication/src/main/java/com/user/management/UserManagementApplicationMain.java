package com.user.management;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class UserManagementApplicationMain 
{
	//UI
	//Controller
	//Service layer - business logic
	//DAO layer - communicates with DB - ORM - Object Relation Mapping
	//DB
	public static void main(String[] args) 
	{
		SpringApplication app = new SpringApplication(UserManagementApplicationMain.class);
        app.setDefaultProperties(Collections.singletonMap("server.port", "8082"));

        app.run(args);

		//SpringApplication.run(UserManagementApplicationMain.class, args);
	}
}
