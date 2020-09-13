import java.util.*;
class Cat
{
	boolean hasFur;
	int legs,eyes;
	String breed;
	void eat()
	{
		System.out.println("Cat is eating");
	}
	public void walk()
	{
		System.out.println("Cat is walking");
	}
	void description()
	{
		System.out.println("My cat has "+legs+" legs and has "+eyes+" eyes");
	}
	public void breed()
	{
		System.out.println("The breed of cat is "+breed);
	}
}
class Dog
{
	String name,breed;
	public void description()
	{
		System.out.println("My dog "+name+" jumped and has breed "+breed);
	}
}

public class ClassObjects {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.close();
		Cat cat1 = new Cat();
		Cat cat2 = new Cat();
		Dog dog1 = new Dog();
		dog1.breed = "Husky";
		dog1.name = "Tuffy";
		dog1.description();
		cat1.breed = "Poodle";
		cat1.breed();
		cat1.legs = 3;
		cat1.eyes = 4;
		cat2.legs = 4;
		cat2.eyes = 2;
		cat1.description();
		cat2.description();
		cat1.walk();
		cat2.eat();
	}
}
