package Chapt4;

public class SingleThread {

	public static void main(String[] args) throws InterruptedException {
		
		createJavaThread1();
		
		createJavaThread2();
		
		createJavaThread3();
		
//		The main Thread is now free and can be executed simultaneously with our other Thread
//		for(int i=0;i<5;i++)
//		{
//			System.out.println("Hey! I am free !!");
//			Thread.sleep(200);
//		}
		
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
