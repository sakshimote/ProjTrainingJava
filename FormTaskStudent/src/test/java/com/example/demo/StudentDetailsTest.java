package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class StudentDetailsTest {
	
	@Test
	public void checkName() {
		
		String expected=StudentDetails.checkName();
		assertEquals("shri", expected);
		
	}
	
	@Test
	public void checkAge() {
		
		int expected=StudentDetails.checkAge();
		assertEquals(22, expected);
		
	}
	
	@Test 
	public void checkSalary() {
		long expected=StudentDetails.checkSalary();
		assertEquals(50000, expected);
	}

}
