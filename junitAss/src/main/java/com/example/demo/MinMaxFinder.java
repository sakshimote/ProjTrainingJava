package com.example.demo;

import java.util.Arrays;

public class MinMaxFinder {
	
	
	public  int[] minMaxFinder(int[] arr) {
		int[] ans=new int[2];
		
		
			int max=Arrays.stream(arr).max().getAsInt();
			int min=Arrays.stream(arr).min().getAsInt();
			
			
				ans[0]=min;
				ans[1]=max;
			
		
		return ans;
	}

}
