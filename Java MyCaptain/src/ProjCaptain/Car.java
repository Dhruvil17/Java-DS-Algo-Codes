package ProjCaptain;
import java.util.*;
import Lectures.MyClass;

public class Car extends MyClass {

	protected String name;
	protected int price;
	protected int gear;
	private String model;
	MyClass o = new MyClass();
	Car()
	{
		name="Suzuki";
        price=90000;
        gear=5;
        o.Sopln("Constructor of Parent class ");
	}
	protected void setModel(String mod)
	{
		model=mod;
	}
	protected String getModel()
	{
		return model;
	}
	public void printData()
	{
	    o.Sopln(name);
	    o.Sopln(price);
	    o.Sopln(gear);
	}
}
