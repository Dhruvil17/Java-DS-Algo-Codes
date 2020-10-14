package Chapt3;

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
	private static void createJavaThread1()
	{
		 ThreadTest1 Test1 = new ThreadTest1();
		
		 Thread th = new Thread(Test1);
		 th.setName("JAVA_THREAD");
		 
		 th.start();
	}
	private static void createJavaThread2()
	{
		 ThreadTest2 Test2 = new ThreadTest2();
		
		 Thread th = new Thread(Test2);
		 th.setName("MACHINE_LEARNING_THREAD");
		 
		 th.start();
	}
	private static void createJavaThread3()
	{
		 ThreadTest3 Test3 = new ThreadTest3();
		
		 Thread th = new Thread(Test3);
		 th.setName("ANDROID_DEVELOPMENT_THREAD");
		 
		 th.start();
	}
}
