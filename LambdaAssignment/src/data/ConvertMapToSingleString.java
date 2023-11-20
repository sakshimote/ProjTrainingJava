package data;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class ConvertMapToSingleString {
	  public static void main(String[] args)
	   
	  {
	          Map<String, String> map = new HashMap<>();
	          map.put("key1", "value1");
	          map.put("key2", "value2");
	          map.put("key3", "value3");

	          String result = map.entrySet().stream()
	                  .map(entry -> entry.getKey() + ": " + entry.getValue())
	                  .collect(Collectors.joining(", "));

	          System.out.println(result);
	      }
}
