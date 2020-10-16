package Chapt12;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolExample {

	public static void main(String[] args) {
		
		ThreadPoolExample threadPool = new ThreadPoolExample();
		
		threadPool.startThreadPool();

	}

	private void startThreadPool() 
	{
		//ExecutorService executorService = Executors.newFixedThreadPool(4); // 4 Threads are working here
		
		//ExecutorService executorService = Executors.newSingleThreadExecutor(); // Single thread is working here
		
		ExecutorService executorService = Executors.newCachedThreadPool(); // As many threads are created as written in program
		
		WorkTask task1 = new WorkTask("Task 1");
		WorkTask task2 = new WorkTask("Task 2");
		WorkTask task3 = new WorkTask("Task 3");
		WorkTask task4 = new WorkTask("Task 4");
		WorkTask task5 = new WorkTask("Task 5");
		WorkTask task6 = new WorkTask("Task 6");
		
		executorService.submit(task1);
		executorService.submit(task2);
		executorService.submit(task3);
		executorService.submit(task4);
		executorService.submit(task5);
		executorService.submit(task6);
		
		executorService.shutdown();
	}
}
