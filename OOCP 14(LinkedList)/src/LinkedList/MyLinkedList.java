package LinkedList;

public class MyLinkedList<E> { // Generic classes. Multiple functionality is achieved here //

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
	public static class Node<E>
	{
		public E data;
		public Node<E> next;
		
		public Node(E data)
		{
			this.data = data;
			next = null;
		}
	}
}
