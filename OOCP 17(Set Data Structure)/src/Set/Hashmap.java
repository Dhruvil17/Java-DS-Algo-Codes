package Set;
import java.util.*;
import java.util.Map.Entry;

public class Hashmap {

	public static void main(String[] args) {
		
		// Map Interface 
		// Elements of map are stored in key/value pairs 
		// Keys are unique associated with the individual values
		// Map Interface extends Collection Framework 
		// It is being implemented by HashSet, TreeMap, EnumMap, LinkedHashMap, WeakHashMap 
		// Internal working of Hash Maps has by default array of 16
		// When load factor of 0.75 is reached, then the size of hash map doubles.
		
		// Methods of Map 
		// put(K,V)
		// putAll()
		// putifAbsent(K,V)
		// get(K)
		// getOrDefault(K,defaultValue)
		// containsKey(K)
		// containsValue(V)
		// replace(K,V)
		
		Map<String,Integer> numbers = new HashMap<>();
		
		numbers.put("one",1);
		numbers.put("two",2);
		numbers.put("five",5);
		numbers.put("ten",10);
		
		numbers.put("one",15); // Update the previous value
		
		numbers.putIfAbsent("one",15); // Puts only if the key is absent in Map
		
		System.out.println(numbers);
		
		System.out.println(numbers.get("ten"));
		
		System.out.println(numbers.containsKey("one"));
		
		System.out.println(numbers.containsValue(4));
		
		System.out.println(numbers.remove("one"));
		
		System.out.println(numbers);
		
		System.out.println(numbers.keySet());
		
		System.out.println(numbers.values());
		
		System.out.println(numbers.entrySet());
		
		// Entry operations 
		
		Set<Entry<String,Integer>> entries = numbers.entrySet();
		
		for(Entry<String,Integer> entry: entries)
		{
			entry.setValue(entry.getValue()*100);
		}
		System.out.println(numbers);
		
		System.out.println(numbers.values());
	}
}