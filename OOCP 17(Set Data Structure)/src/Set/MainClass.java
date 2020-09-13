package Set;
import java.util.*;

public class MainClass {

	public static void main(String[] args) {
		
		// Set Interface 
		// Implements Set Interface
		// 1. HashSet
		// 2. LinkedHashSet
		// 3. EnumSet
		// 4. TreeSet
		
		// Methods of Set Interface 
		
		// 1. add(element) , add(index,element) is also there 
		// 2. addAll(Collection)
		// 3. remove(index)
		// 4. removeAll()
		// 7. clear()
		// 8. size()
		// 9. contains()
		// 10. containsAll()
		// 10. isEmpty()
		// 11. toArray()
		// 12. retainAll()
		
		// Here order is not mainrained
//		Set<String> fruits = new HashSet<String>();
//		fruits.add("Apple");
//		fruits.add("Banana");
//		fruits.add("Kiwi");
//		fruits.add("Banana");
//		System.out.println(fruits);
//		
//		// Here order is mainrained
//		Set<String> fruits2 = new LinkedHashSet<String>();
//		fruits2.add("Apple");
//		fruits2.add("Banana");
//		fruits2.add("Kiwi");
//		fruits2.add("Banana");
//		System.out.println(fruits2);
		
		Set<Integer> s1 = new HashSet<>();
		s1.add(12);
		s1.add(45);
		s1.add(56);
		
		Set<Integer> s2 = new HashSet<>();
		s2.add(67);
		s2.add(12);
		s2.add(56);
		
		//s1.addAll(s2);
		
		System.out.println(s1);
		
		s1.retainAll(s2);
		System.out.println(s1);	
		
		System.out.println(s1.containsAll(s2));
	}	
}
