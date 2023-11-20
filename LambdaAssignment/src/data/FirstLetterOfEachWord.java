package data;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class FirstLetterOfEachWord {
	 public static void main(String[] args) {
	        List<String> words = new ArrayList<>();
	        words.add("hello");
	        words.add("world");
	        words.add("this");
	        words.add("is");
	        words.add("a");
	        words.add("test");

	        StringBuilder result = new StringBuilder();
	        Consumer<String> addToResult = word -> result.append(word.charAt(0));
	        words.forEach(addToResult);

	        System.out.println(result.toString());
	    }

}
