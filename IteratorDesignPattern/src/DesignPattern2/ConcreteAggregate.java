package DesignPattern2;

public class ConcreteAggregate implements Aggregate{

	String names[] = {"Dhruvil","Dishant","Bhavya","Sagar","Dev","Smit"};

	@Override
	public Iterator createIterator() 
	{
		return new ConcreteIterator();
	}
	
	private class ConcreteIterator implements Iterator
	{
		int index = 0;
		int i = 0;
		@Override
		public boolean hasNext() 
		{
			if(index < names.length)
			{
				index++;
				return true;
			}
			return false;
		}
		@Override
		public Object next() 
		{
			return names[i++];
		}
	}
}
