package ProjCaptain;
import java.util.*;
import java.io.*;
import Lectures.MyClass;

public class Suzuki extends Car{
	
	Suzuki()
	{
		o.Sopln("Constructor of child Class");
	}

	static MyClass o = new MyClass();
	public static void main(String[] args) throws NumberFormatException, IOException
	{
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int a,b,r;
//		Shape rect = new Shape();
//		Shape cir = new Shape();
//		cir.setName("Circle");
//		o.Sopln(rect.getName());
//		o.Sopln(cir.getName());
//		o.Sopln("Enter two numbers to calculate area of Rectangle : ");
//		a=Integer.parseInt(br.readLine());
//		b=Integer.parseInt(br.readLine());
//		o.Sopln("Enter the value of radius to calculate area of Ciccle : ");
//		r=Integer.parseInt(br.readLine());
//		rect.setSize(a,b);
//		cir.setSize(r);
//		double d = rect.getArea(b); // 1. Encapsulation as user does not need to know how area and all is getting calculates //
//		o.Sop("Area of Rectangle is : "+d);
//		o.Sop("Area of Circle is : "+cir.getArea());
		Car car = new Car();
		car.printData();
		car.setModel("Wagon R");
		car.gear=10;
		car.price=100000;
		car.printData();
	    o.Sopln(car.getModel());
	    
	    // Object of out main Class //
	    Suzuki suzuki = new Suzuki();
	    suzuki.gear=16;
	    suzuki.printData();
	    suzuki.setModel("A800");
	    o.Sopln(suzuki.getModel());
	}
}


// 1. Abstraction - Natural mapping and association of data and programs or subprograms which operate on the data
// 2. Encapsulation - Showing only the relatable part which is useful to users and hiding all the details from the user
// 3. Abstraction - Parent child relationship and subclass can have more properties other than the inherited properties of parent class
// 4. Polymorphism - Basic method overloading. Creating methods with same name but with different signatures so that they have different functionalities
