package Data;

import java.util.Arrays;
import java.util.List;

public class DataDatabase {
	
	
	 public static List<Fruit> getAllFruits(){
		 
		 Fruit fruit1=new Fruit("apple",50,50,"red");
		 Fruit fruit2=new Fruit("mango",70,500,"yellow");
		 Fruit fruit3=new Fruit("strawberry",60,30,"red");
		 
		 List<Fruit> list1=Arrays.asList(fruit1,fruit2,fruit3);
		 
		 
		 return list1;
		 
	 
	 }
	 
	 public static List<News> getAllNews(){
		 News news1=new News(1, "shri", "sakshi", "breaking news");
		 News news2=new News(2, "sakshi", "shri", "another breaking news");
		 List<News> list1=Arrays.asList(news1,news2);
		 return list1;
	 }

}
