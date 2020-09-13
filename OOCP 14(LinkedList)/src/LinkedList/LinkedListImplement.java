package LinkedList;
import java.awt.geom.Area;
import java.util.*;

public class LinkedListImplement {

	public static void main(String[] args) {
		
		List<Integer> ll = new LinkedList<Integer>();
		// Functions or methods in LinkedList are same ad List or ArrayList
		
		// 1. add method 
		ll.add(12);
		ll.add(87);
		ll.add(57);
		ll.add(35);
		System.out.println(ll);
		
		// 2. get method
		System.out.println(ll.get(2));
		
		// 3. set method
		ll.set(2,45);
		System.out.println(ll);
		
		// 4. remove method
		ll.remove(3);
		System.out.println(ll);
		
		// 5. addAll method
		
		List<Integer> ll2 = new LinkedList<>();
		ll2.add(67);
		ll2.add(89);
		ll2.add(90);
		
		ll.addAll(1,ll2);
		System.out.println(ll);
		
		// 6. removeAll method
		
		ll2.removeAll(ll2);
		System.out.println(ll2);
		
		// 7. size method
		
		System.out.println(ll.size());
		
		// 8. contains method
		
		System.out.println(ll.contains(35));
		
		// 9. isEmpty method
		
		System.out.println(ll2.isEmpty());
		
		// 10. toArray method
		
		ll.toArray();
		System.out.println(ll);
	
		// How is LinkedList implemented in Java -> Important Interview Question 
		
		
		int a[][] = new int[5][5];
		int n=a.length;
		System.out.println();	
		
	

	}
}
