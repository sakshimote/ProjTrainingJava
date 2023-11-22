package com.example.demo;

public class MinMax {
	
	
	
	private static int min;
	private static int max;
	
	public MinMax(int min,int max) {
		this.min=min;
		this.max=max;
	}

	public static int getMin() {
		return min;
	}

	public static void setMin(int min) {
		MinMax.min = min;
	}

	public static int getMax() {
		return max;
	}

	public static void setMax(int max) {
		MinMax.max = max;
	}
	
	

}
