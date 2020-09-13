package Queue;
import java.util.*;

public class MainClass {

	public static void main(String[] args) {
		
		// Queue can be implemented in Java using LinkedList, ArrayDequeue and Priority Queue
		// Methods of queue which throw exception
		// 1. add()
		// 2. remove()
		// 3. element()
		
		// Methods of queue which do not throw exception
		// 1. offer()
		// 2. poll()
		// 3. peek()
		
		Queue<Integer> q = new LinkedList<Integer>();
		
		q.add(67);
		q.add(45);
		q.add(25);
		
		int pop = q.poll();
		
		System.out.println(q);
		System.out.println(pop);
//		
//		MyQueue<Integer> myq = new MyQueue<Integer>();
//		
//		myq.enqueue(23);
//		myq.enqueue(56);
//		myq.enqueue(69);
//		myq.enqueue(78);
//		int x = myq.dequeue();
//
//		System.out.println(x);
//		
//		System.out.println("Elements in the queue are : ");
//		myq.traverse();
		
	}
}
