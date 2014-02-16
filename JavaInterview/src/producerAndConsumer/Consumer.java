package producerAndConsumer;

import java.util.concurrent.ConcurrentLinkedQueue;

public class Consumer implements Runnable{
	private String name;
	private int consumeTime;
	private volatile ConcurrentLinkedQueue<Television> queue;

	public Consumer(String name, int time,
			ConcurrentLinkedQueue<Television> queue) {
		this.name = name;
		this.consumeTime = time;
		this.queue = queue;
	}

	public void run() {
		try {
			Thread.sleep(consumeTime);
			if (queue.peek() != null) {
				Television tv = queue.poll();
				System.out.println("Consumer " + name + " consumes TV "
						+ tv.getID());
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
