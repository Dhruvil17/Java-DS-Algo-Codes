package Queue;
import java.util.*;

public class Arraydeque {

	public static void main(String[] args) {
		
//		ArrayDeque<Integer> aq = new ArrayDeque<Integer>();
//	  
		// Total 21 functions are there in ArrayDeque
		// Double ended queue implements using arrays
//		aq.add(23);
//		aq.add(56);
//		aq.add(56);
//		int pop = aq.poll();
//		System.out.println(pop);
		
		// Implementation like stack
		
//		aq.push(56);
//		aq.push(34);
//		aq.push(78);
//		int z = aq.pop();
//		System.out.println(z);
//		
		
		Deque<Integer> dq = new LinkedList<>();
		dq.addLast(34);
		dq.addLast(56);
		dq.addLast(98);

		int peek1 = dq.peekFirst();
		int peek2 = dq.peekLast();
		int remove1 = dq.removeLast();
		System.out.println(peek1);
		System.out.println(peek2);
		System.out.println(remove1);
		
		
	}
}
