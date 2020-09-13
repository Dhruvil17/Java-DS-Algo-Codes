public class Students {

	//Attributes
	String name;
	int age;
	String college;
	public String getDetails()
	{
		return "My name is "+this.name+"\nMy age is "+this.age+"\nI am currently studying in "+this.college;
	}
	public Students(String name,int age,String college)
	{
		this.name=name;
		this.age=age;
		this.college=college;
	}
	public static void main(String[] args) {
    Students students=new Students("Dhruvil Soni",19,"PDPU");
    students.college="PANDIT DEENDAYal PETROLEUM UNIVERSITY";
    System.out.println(students.getDetails());
	}
}
