package Stack;

public class LinkedList<E> {

	Node<E> head;
	
	public void add(E data)
	{
		Node<E> toAdd = new Node<E>(data);
		if(head==null)
		{
			head = toAdd;
			return;
		}
		else
		{
			Node<E> temp;
			temp = head;
			while(temp.next!=null)
			{
				temp = temp.next;
			}
			temp.next = toAdd;
		}
	}
	void traverse()
	{
		Node<E> temp = head;
		System.out.println("Elements of the Linked List are : ");
		while(temp!=null)
		{
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
	public E toRemove() throws Exception
	{	
		Node<E> temp=head;
		
		if(head==null)
		{
			throw new Exception("Can not remove the last element");
		}
		if(temp.next==null)
		{
			Node<E> toRemove = head;
			head = null;
			return toRemove.data;
		}
		while(temp.next.next!=null)
		{
			temp = temp.next;
		}
		Node<E> toRemove = temp.next;
		temp.next = null;
		return toRemove.data;
	}
	public E toGetPeek() throws Exception
	{
		Node<E> temp = head;
		if(temp==null)
		{
			throw new Exception("Can not peek the element");
		}
		while(temp.next!=null)
		{
			temp = temp.next;
		}
		return temp.data;
	}
	static class Node<E>
	{
		E data;
		Node<E> next;
		
		public Node(E data)
		{
			this.data = data;
			next = null;
		}
	}
	public boolean isEmpty() {
		return head == null;
	}
	
}
