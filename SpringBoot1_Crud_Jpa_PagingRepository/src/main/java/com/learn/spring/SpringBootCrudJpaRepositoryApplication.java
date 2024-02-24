package com.learn.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

@SpringBootApplication
//to exclude database configuration 
//or else throws -> failed to configure a datasource url attribute
//@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class,
//		HibernateJpaAutoConfiguration.class})
public class SpringBootCrudJpaRepositoryApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(SpringBootCrudJpaRepositoryApplication.class, args);
		System.out.println("hello");
	}

}
