package Stack;
import java.util.*;

public class StackMain {

	public static void main(String[] args) throws Exception {
		
		// Methods of Stack 	
		// 1. push(E e)
		// 2. pop
		// 3. peek
		// 4. search(E e)
		// 5. empty
		
		MyStack<Integer> stack = new MyStack<Integer>();
		
		stack.push(12);
		stack.push(24);
		stack.push(43);
		int num=stack.pop();
		System.out.println(num);
		int temp=stack.peek();
		System.out.println(temp);
	}
}
