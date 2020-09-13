package Stack;
import java.util.*;

public class Stack_Problem {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int testcases;
		testcases = sc.nextInt();
		boolean isBalanced = true;
		while(testcases-- > 0)
		{
			Stack<Character> stack = new Stack<Character>();
		    String str = null;
		    str = sc.next();
		    int length = str.length();
		    char arr[] = str.toCharArray();
		    for(int i=0;i<length;i++)
		    {
		    	if(stack.empty())
		    	{
		    		stack.push(arr[i]);
		    	}
		    	else if(arr[i]=='{' || arr[i]=='(' || arr[i]=='[')
		        {
		            stack.push(arr[i]);
		        }
		        else
		        {
		        	if(arr[i]=='}' && stack.peek()=='{')
			        {
		        		stack.pop();
			        }
			        else if(arr[i]==')' && stack.peek()=='(')
			        {
			        	stack.pop();
			        }
			        else if(arr[i]==']' && stack.peek()=='[')
			        {
			        	stack.pop();
			        }
			        else
			        {
			        	isBalanced = false;
			        }
		        }
		    }
		    if(!stack.empty())
	        {
	            isBalanced = false;
	        }
		    if(isBalanced)
		    {
		    	System.out.println("balanced");
		    }
	        else
	        {
	            System.out.println("not balanced");
	        }
		}
		sc.close();
	}
}
