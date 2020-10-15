package Chapt4;

public class SingleThread {

	public static void main(String[] args) throws InterruptedException {
		
		// Second method to create Thread by Thread Class in Java which has implemented Runnable Interface
		
		createJavaThread1();
		
		createJavaThread2();
		
		createJavaThread3();
	}
	public static void createJavaThread1()
	{	
		new ThreadTest1().start();
	}
	private static void createJavaThread2()
	{
		 new ThreadTest2().start();
	}
	private static void createJavaThread3()
	{
		 new ThreadTest3().start();
	}
}
