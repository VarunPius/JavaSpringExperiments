package com.vpiusr.spring_data;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringDataApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDataApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(StudentRepository studentRepository){
		return args -> {
			Student maria = new Student("Maria", "DeSantos","mariades@xyz.io", 21);
			studentRepository.save(maria);
		};
	}

}
