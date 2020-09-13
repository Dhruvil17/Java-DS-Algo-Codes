package LinkedList;
import java.util.*;


public class ArrayList_LinkedList {

	public static void main(String[] args) {
		
//		List<Integer> ll = new ArrayList<>();
//		List<Integer> al = new LinkedList<>();
		
//		getTimeDiff(ll);
//		getTimeDiff(al);
//		
//		MyLinkedList<String> myll = new MyLinkedList<String>();
//		myll.add(34 + " added");
//		myll.add(89 + " added");
//		myll.add(67 + " added");
//		myll.traverse();
			
		LinkedList<Integer> l1 = new LinkedList<Integer>();
		LinkedList<Integer> l2 = new LinkedList<Integer>();
		l1.add(34);
		l1.add(67);
		l2.add(89);
		l2.add(45);
		l1.addAll(l2);
		System.out.println(l1);

    }
	
	static void getTimeDiff(List<Integer> list)
	{
		long start = System.currentTimeMillis();
		
		for(int i=0;i<100000;i++)
		{
			list.add(0,i);
		}
		long end = System.currentTimeMillis();
		
		long Diff = end - start;
		System.out.println(list.getClass().getName()+" -> "+Diff);
	}
}
