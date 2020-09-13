package Queue;
import LinkedList.MyLinkedList.*;

public class MyQueue<E> {

	private Node<E> head, rear;
	
	public void enqueue(E e)
	{
		Node<E> toAdd = new Node<>(e);
		if(head==null)
		{
			head = rear = toAdd;
		}
		rear.next = toAdd;
		rear = rear.next;
	}
	public E dequeue()
	{
		if(head==null)
		{
			return null;
		}
		Node<E> temp = head;
		head = head.next;
		return temp.data;
	}
	public void traverse()
	{
		Node<E> temp = head;
		while(temp!=null)
		{
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
}
