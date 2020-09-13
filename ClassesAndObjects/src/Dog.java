public class Dog {
	
	//OOCP Program 1 (Objects and Classes)
	//Instance Variables
	String name;
	String breed;
	String colour;
	int age;
	//Constructor declaration of class with Arguments
	public Dog(String name,String breed,String colour,int age)
	{
		this.name=name;
		this.breed=breed;
		this.colour=colour;
		this.age=age;
	}
	//Method 1
    public String getName()
    {
    	return name;
    }
    //Method 2
    public String getBreed()
    {
    	return breed;
    }
    //Method 3
    public String getColour()
    {
    	return colour;
    }
    //Method 4
    public int age()
    {
    	return age;
    }
    //Print all details in main Function
    public String toString()
    {
    	return ("Hi! My name is "+this.getName()+"\nMy breed is "+this.getBreed()+"\nMy colour is "+this.getColour()+"\nMy age is "+this.age());
    }
	
	public static void main(String[] args) {
    Dog dog=new Dog("Tuffy","Papillon","White",10);
    System.out.println(dog.toString());
	}
}
