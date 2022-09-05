package com.example.classregistryapp;

import com.example.classregistryapp.repository.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@EnableJpaRepositories(basePackageClasses = UserRepository.class)
public class ClassRegistryAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClassRegistryAppApplication.class, args);
	}

}
