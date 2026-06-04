package com.eduhub.eduhub_backend;

import com.eduhub.eduhub_backend.component.Student1;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class EduhubBackendApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(EduhubBackendApplication.class, args);
		Student1 s=context.getBean(Student1.class);
		s.study();
	}
}
