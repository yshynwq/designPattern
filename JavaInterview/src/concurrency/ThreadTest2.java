package concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadTest2 {
	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(5);
		for(int i=0; i<10; i++){
			Runnable worker = new Worker("NO"+i, 100*i);
			executorService.execute(worker);
		}
		
		executorService.shutdown();
	}
}
class Worker implements Runnable{
	
	static volatile int amount=100;
	private int sleep;
	private String name;
	public Worker(String name, int sleep) {
		this.name = name;
		this.sleep = sleep;
	}
	@Override
	public void run() {
		for(int i =0 ; i<5; i++){
			try {
				Thread.sleep(sleep);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Thread Name: "+name +" eat "+amount--);
		}
	}
	
}