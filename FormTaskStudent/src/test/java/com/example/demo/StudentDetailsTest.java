package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class StudentDetailsTest {
	
	@Test
	public void checkName() {
		
		String expected=StudentDetails.checkName();
		String actual="shri";
		assertEquals(actual, expected);
		
	}
	
	@Test
	public void checkAge() {
		
		int expected=StudentDetails.checkAge();
		int actual=22;
		assertEquals(actual, expected);
		
	}
	
	@Test 
	public void checkSalary() {
		long expected=StudentDetails.checkSalary();
		long actual=50000;
		assertEquals(actual, expected);
	}

}
