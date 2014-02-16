package producerAndConsumer;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test {
	public static void main(String[] args) {
		ConcurrentLinkedQueue<Television> sharequeue = new ConcurrentLinkedQueue<Television>();
		ExecutorService consumers = Executors.newFixedThreadPool(5);
		ExecutorService producers = Executors.newFixedThreadPool(5);
		
		for(int i=0; i<5; i++){
			Producer p = new Producer("NO."+i, 500, sharequeue);
			Consumer c = new Consumer("NO."+i, 200, sharequeue);
			producers.execute(p);
			consumers.execute(c);
		}
		
	}
}
