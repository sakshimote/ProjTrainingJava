package data;

import java.util.ArrayList;
import java.util.List;

public class RemoveOddLengthWord {
	
	public static void main(String[] args) {
		  List<String> words = new ArrayList<>();
	        words.add("hello");
	        words.add("world");
	        words.add("this");
	        words.add("is");
	        words.add("a");
	        words.add("test");

	        words.removeIf(word ->word.length() % 2 == 1);

	        System.out.println(words);
	    }

	
	}

