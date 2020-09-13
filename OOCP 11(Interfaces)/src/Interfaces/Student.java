package Interfaces;

public abstract interface Student {

	abstract void study();
	
	default void editVideo()
	{
		System.out.println("Video is being edited by Student");
	}
}
