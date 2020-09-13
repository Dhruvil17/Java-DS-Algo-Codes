package Stack;

public class MyStack<E> {

	LinkedList<E> ll = new LinkedList<E>();
	
	void push(E e)
	{
		ll.add(e);
	}
	E pop() throws Exception
	{
		if(ll.isEmpty())
		{
			throw new Exception("Stack is empty");
		}
		return ll.toRemove();
	}
	E peek() throws Exception
	{
		return ll.toGetPeek();
	}
		
}
