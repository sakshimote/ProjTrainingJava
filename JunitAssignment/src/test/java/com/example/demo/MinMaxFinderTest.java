package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

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
	    
	    @Test
	    public void findMinMaxWithPositiveIntegers2() {
	        int[] arr = {1, 2, 3, 4, 5};

	        MinMax minMax = MinMaxFinder.findMinMaxAnother(arr);
	        assertEquals(1, minMax.getMin());
	        assertEquals(5, minMax.getMax());
	    }

	    @Test
	    public void findMinMaxWithNegativeIntegers2() {
	        int[] arr = {-5, -4, -3, -2, -1};

	        MinMax minMax = MinMaxFinder.findMinMaxAnother(arr);
	        assertEquals(-5, minMax.getMin());
	        assertEquals(-1, minMax.getMax());
	    }

	    @Test
	    public void findMinMaxWithMixedIntegers2() {
	        int[] arr = {-2, 3, -1, 5, -4};

	        MinMax minMax = MinMaxFinder.findMinMaxAnother(arr);
	        assertEquals(-4, minMax.getMin());
	        assertEquals(5, minMax.getMax());
	    }

	    
	    

}
