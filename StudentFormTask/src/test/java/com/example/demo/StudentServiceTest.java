package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.controller.StudentController;
import com.example.demo.model.Student;

@SpringBootTest
public class StudentServiceTest {
	public static Student student=new Student();
	
	
	
	@Test
	void addUser() {
		student.setName("shri");
		
		assertNotNull(student,"user is null");
		assertNotNull(student.getName(),"name required");

		// get the userProfile by when then method
		
		
		Student student2=new Student();
		student2.setName("shri");
		student2.setAge(22);
		student2.setSalary(50000);
		student2.setStudentId(1);
		
		assertNotNull(student);
		
		
	}
	
	

}
