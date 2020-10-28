package DesignPattern1;

public class MainClass {

	public static void main(String[] args) {	
		
		ConcreteAggregate<String> cg = new ConcreteAggregate<String>();
		
		cg.add("Dhruvil");
		cg.add("Bhavya");
		cg.add("Dishant");
		cg.add("Sagar");
		cg.add("Smit");
		cg.add("Dev");
		cg.remove(3);
		cg.add(34);
		cg.add(32);
		cg.add(56);
		cg.add(67);
		cg.add(78);
		cg.add(89);
	
		Iterator it = cg.createIterator();
		
		System.out.println("Elements of ArrayList are :");
		while(it.hasNext())
		{
			Object x = (Object)it.next();
			System.out.println(x);
		}
		System.out.println("Size of ArrayList is : "+cg.size());
	}
}
