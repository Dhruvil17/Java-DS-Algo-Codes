package Encapsulation;

public class Student {

	private int age;
	private String name;
	
	public int getAge()
	{
		return age;
	}
	public void setAge(int age)
	{
		if(age>=19 && age<24)
		{
			System.out.println("You are doing B.Tech in PDPU");
		}
		else
		{
			System.out.println("You are passout from PDPU");
		}
		this.age=age;
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		if(name == "Dhruvil")
		{
			System.out.println("You are eligible");
		}
		else
		{
			System.out.println("You are not eligible");
		}
		this.name=name;
	}
	
}
