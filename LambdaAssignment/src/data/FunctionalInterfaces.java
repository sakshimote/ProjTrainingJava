package data;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalInterfaces {
	
	
	public static void main(String[] args) {
		
		
		Supplier<Double> randomSupplier = () -> Math.random();
		double randomDouble = randomSupplier.get();
		System.out.println(randomDouble);
		
		Consumer<String> printConsumer = (s) -> System.out.println(s);
		printConsumer.accept("Hello Java");
		
		Predicate<String> isEmptyPredicate = (s) -> s.isEmpty();
		boolean isEmpty = isEmptyPredicate.test("  ");
		System.out.println(isEmpty);
		
		
		Function<String, Integer> parseIntFunction = (s) -> Integer.parseInt(s);
		int integerValue = parseIntFunction.apply("123");
		System.out.println(integerValue);
	}
	


}
