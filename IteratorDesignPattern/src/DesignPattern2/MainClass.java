package DesignPattern2;

public class MainClass {

	public static void main(String[] args)
	{
		ConcreteAggregate cg = new ConcreteAggregate();
		
		Iterator it = cg.createIterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
}
