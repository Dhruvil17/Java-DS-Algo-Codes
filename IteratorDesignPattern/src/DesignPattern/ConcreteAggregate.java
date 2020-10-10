package DesignPattern;
import java.util.*;

public class ConcreteAggregate<E> implements Aggregate {
	
	List<E> list;
	
	public ConcreteAggregate()
	{
		list = new ArrayList<E>();
	}
	@Override
	public Iterator createIterator() 
	{
		return new ConcreteIterator();
	}
	@SuppressWarnings("unchecked")
	@Override
	public void add(Object item) 
	{
		list.add((E) item);
	}
	@Override
	public Object getAt(int index) 
	{
		return list.get(index);
	}
	@Override
	public void remove(int index)
	{
		list.remove(index);
	}
	@Override
	public int size()
	{
		return list.size();
	}
	private class ConcreteIterator implements Iterator
	{
		int index = 0;
		@Override
		public boolean hasNext() 
		{
			if(index < list.size())
			{
				return true;
			}
			return false;
		}
		@Override
		public Object next() 
		{
			if(this.hasNext())
			{
				return list.get(index++);
			}
			return 0;
		}
	}
}
