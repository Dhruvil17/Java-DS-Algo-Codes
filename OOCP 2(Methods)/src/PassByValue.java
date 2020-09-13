public class PassByValue {

	public static void main(String[] args) {
    // Java is always Pass by Value //
		
	    int c = 12;
	    int d = 34;
	    swap(c,d);
	    System.out.println(c+" "+d);
	    Dog e = new Dog();
	    e.legs = 4;
	    Dog f = new Dog();
	    f.legs = 2;
	    swap(c,d); 
	    System.out.println(e.legs +" "+f.legs);
	    Dog g = new Dog();
	    g.legs = 6;
	    change(g);
	    System.out.println(g.legs);
	}
	static void swap(int a,int b)
	{
		int temp = a;
		a = b;
		b = temp;
	}
	static void swap(Dog a,Dog b)
	{
		Dog temp = a;
		a = b;
		b = temp;
	}
	static void change(Dog dog)
	{
		dog.legs = 10;
	}
}
class Dog
{
	int legs;
}

