package data;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class PrintNumbersThread {
	
	public static void main(String[] args) {
		 List<Integer> numbers = new ArrayList<>();
	        numbers.add(1);
	        numbers.add(2);
	        numbers.add(3);
	        numbers.add(4);
	        numbers.add(5);

	        Consumer<Integer> printNumber = number -> System.out.println(number);

	        Thread thread = new Thread(() -> numbers.forEach(printNumber));
	        thread.start();
	}

}
