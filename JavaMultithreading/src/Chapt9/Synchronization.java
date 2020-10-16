package Chapt9;
import java.util.*;

public class Synchronization {

	public static void main(String[] args) throws InterruptedException {
		
		List<Character> list = new ArrayList<Character>();
		
		Thread thread1 = new StringReverseThread(list,"HELLO");
		thread1.setName("First Thread");
		thread1.start();
		
		Thread thread2 = new StringReverseThread(list,"WORLD"); // Getting wrong message as list is same for both messages
		thread2.setName("Second Thread");
		thread2.start(); 
		
		thread1.join();
		thread2.join();

	}
}
