package ArrayListaAndGenerics;
import java.util.*;

public class Array_List {

	public static void main(String[] args) {
		
		// ArrayList -> Implementation of List Interface and allows to create resizable arrays //
//		// Without use of generics 
//		ArrayList fruits=new ArrayList();
//		
//		fruits.add("Mango");
//		fruits.add(23);
//		System.out.println(fruits);
//		
		// With use of Generics
		ArrayList<String> list=new ArrayList<>();
		
		list.add("Apple");
		list.add("Rasberry");
		System.out.println(list);
		System.out.println(list.get(1));
		
		Pair<String,Integer> p1 = new Pair<>("Dhruvil",32); // Generic classes formed here //
		Pair<Boolean,Integer> p2 = new Pair<>(true,3257);
		
		p1.getDescription();
		p2.getDescription();
		
		
		// Methods of ArrayList 
		// 1. add(element) , add(index,element) is also there 
		// 2. addAll(Collection)
		// 3. get(index)
		// 4. set(index,value)
		// 5. remove(index)
		// 6. removeAll()
		// 7. clear()
		// 8. size()
		// 9. contains()
		// 10. isEmpty()
		// 11. isArray()
		
		List<String> s1 = new LinkedList<String>();
		List<String> s2 = new ArrayList<String>();
		int a=9;
		int b=89;
		int ans;
		ans = Math.abs(a-b);
		
		s1.add("Banana");
		s1.add("Orange");
		s2.add("Potato");
		s2.add("Cauli Flower");
		
		s1.addAll(s2);
		System.out.println(s1);
		
		System.out.println(s1.size());
		System.out.println(s1.contains("Mango"));
		System.out.println(s1.isEmpty());
		
		String temp[] = new String[s1.size()];
		s1.toArray(temp);
		for(String e: temp)
		{
			System.out.println(e);
		}
		
//		s1.clear();
//		System.out.println(s1);
		
//		System.out.println(s1.get(3));
//		
//		s1.set(2,"Apple");
//		System.out.println(s1);
//		
//		s1.remove(2);
//		System.out.println(s1);
//		
//		List<String> toRemove = new ArrayList<String>();
//		toRemove.add("Banana");
//		toRemove.add("Cauli Flower");
//		
//		s1.removeAll(toRemove);
//		System.out.println(s1);
//		
//	
		
	}
}
