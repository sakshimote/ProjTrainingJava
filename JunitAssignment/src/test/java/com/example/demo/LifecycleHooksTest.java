package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class LifecycleHooksTest {
	
	  private static int counter;

	    @BeforeAll
	    public static void setUpClass() {
	        System.out.println("@BeforeClass: Setting up the class");
	        counter = 0;
	    }

	    @BeforeEach
	    public void setUp() {
	        System.out.println("@BeforeEach: Setting up the test");
	        counter++;
	    }

	    @Test
	    public void test1() {
	        System.out.println("@Test: Executing test 1");
	        assertEquals(1, counter);
	    }

	    @Test
	    public void test2() {
	        System.out.println("@Test: Executing test 2");
	        assertEquals(2, counter);
	    }

	    @AfterEach
	    public void tearDown() {
	        System.out.println("@AfterEach: Tearing down the test");
	    }

	    @AfterAll
	    public static void tearDownClass() {
	        System.out.println("@AfterClass: Tearing down the class");
	    }

}
