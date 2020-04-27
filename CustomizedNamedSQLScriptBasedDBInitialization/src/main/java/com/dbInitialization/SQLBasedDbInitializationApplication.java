package com.dbInitialization;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * 
 * @author TA
 * This application is simple jpa application with one pojo class. It should create table at the beginning and should insert data automatically in that table at the beginning from DataloaderClass.
 *
 */

@SpringBootApplication
@EnableSwagger2
public class SQLBasedDbInitializationApplication {

	public static void main(String[] args) {
		SpringApplication.run(SQLBasedDbInitializationApplication.class, args);
	}

}
