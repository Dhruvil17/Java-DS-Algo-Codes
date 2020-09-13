package Interfaces;

public class Person implements Student, YouTuber {

	public static void main(String[] args) {
		
		// Interfaces are always Implemented using implements keyword in Main Class //
		// By default Interface has abstract classes so we need to implement them in the Child Class //
		// Interface does not have any default or no Constructor and thus we can not instantiate it//
		Person p = new Person();
		p.study();
		p.makeVideo();
		// p.editVideo(); -> Diamond Problem here as Pure Abstraction is not Achieved //
	}

	public void makeVideo() 
	{
		System.out.println("Person is studying");
	}
	public void study() 
	{
		System.out.println("Person is making videos");
	}
	// Interface has abstraction and supports concept like Multiple Inheritance //
	public void videoeditor() 
	{
	
	}
	public void editVideo()
	{
		Student.super.editVideo();
	}
}
