package Data;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamsFilter {
	
	
	public static List<String> filterByLowCaloryDesc(){
	
	List<Fruit> list1= DataDatabase.getAllFruits().stream().filter(
				fruit->fruit.getCalories()<100)
			.sorted(Comparator.comparing(Fruit::getCalories).reversed())
				.collect(Collectors.toList());
	
	return list1.stream().map(Fruit::getName).collect(Collectors.toList());
		
	}
	
	public static Map<String, String> colorWiseFruitList(){
		
		Map<String,String> map1=DataDatabase.getAllFruits().stream().collect(Collectors.toMap(Fruit::getName, Fruit::getColor));
		
		return map1;
		
		
	}
	
	public static List<String> filterByRedAndPriceAsc(){
		List<Fruit> list1= DataDatabase.getAllFruits().stream().filter(fruit->fruit.getColor().equalsIgnoreCase("red")).sorted(Comparator.comparing(Fruit::getPrice)).collect(Collectors.toList());
	return list1.stream().map(Fruit::getName).collect(Collectors.toList());
	}
	
	public static List<News> newsIdHavingMaxComments(){
return null;
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		System.out.println(filterByLowCaloryDesc());
		System.out.println(colorWiseFruitList());
		System.out.println(filterByRedAndPriceAsc());
		

	
	}

}
