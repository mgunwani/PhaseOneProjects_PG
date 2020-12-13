package MapDemonstrations;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExampleOne {

	public static void main(String[] args) {
		
		/*
		 * Map is an interface that stores the elements in Key-Value pair.
		 */
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Amit");
		map.put(2, "Kartik");
		map.put(3, "Shreya");
		map.put(4, "Gopal");
		map.put(5, "James");
		
		
		/* Set set = map.entrySet();
		Iterator iterator = set.iterator();
		while(iterator.hasNext()) {
			Map.Entry<Integer, String> entry = (Map.Entry<Integer, String>)iterator.next();
			System.out.println(entry.getKey() + " : " + entry.getValue());
		} */
		
		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		
		for (Integer key : map.keySet()) {
			System.out.println(key);
		}
		
		for (String value : map.values()) {
			System.out.println(value);
		}
		
		
	}
}
