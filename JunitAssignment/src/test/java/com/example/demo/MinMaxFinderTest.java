package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MinMaxFinderTest {
	
	 @Test
	    public void findMinMaxWithPositiveIntegers() {
	        int[] arr = {1, 2, 3, 4, 5};
	        int[] expectedMinMax = {1, 5};

	        int[] actualMinMax = MinMaxFinder.findMinMax(arr);
	        assertArrayEquals(expectedMinMax, actualMinMax);
	    }

	    @Test
	    public void findMinMaxWithNegativeIntegers() {
	        int[] arr = {-5, -4, -3, -2, -1};
	        int[] expectedMinMax = {-5, -1};

	        int[] actualMinMax = MinMaxFinder.findMinMax(arr);
	        assertArrayEquals(expectedMinMax, actualMinMax);
	    }

	    @Test
	    public void findMinMaxWithMixedIntegers() {
	        int[] arr = {-2, 3, -1, 5, -4};
	        int[] expectedMinMax = {-4, 5};

	        int[] actualMinMax = MinMaxFinder.findMinMax(arr);
	        assertArrayEquals(expectedMinMax, actualMinMax);
	    }

}
