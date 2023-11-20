package data;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ReplaceWithUpperCaseEquivalent {
	
	   public static void main(String[] args) {
		   
	        List<String> words = new ArrayList<>();
	        words.add("hello");
	        words.add("world");
	        words.add("this");
	        words.add("is");
	        words.add("a");
	        words.add("test");

	        List<String> uppercaseWords = words.stream()
	                .map(word -> word.toUpperCase())
	                .collect(Collectors.toList());

	        System.out.println(uppercaseWords);
	    }

}
