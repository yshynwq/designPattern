package producerAndConsumer;

import java.util.UUID;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Producer implements Runnable{
	private String name;
	private int produceTime;
	private volatile ConcurrentLinkedQueue<Television> queue;
	public Producer(String name, int time, ConcurrentLinkedQueue<Television> queue) {
		this.name = name;
		this.produceTime = time;
		this.queue = queue;
	}
	
	public void run() {
		try {
			Thread.sleep(produceTime);
			if(queue.size()<=10){
				Television tv = new Television(UUID.randomUUID().toString());
				System.out.println("Producer "+name+" produces TV "+tv.getID());
				queue.add(tv);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
