package concurrency;

public class ThreadTest {
	public static void main(String[] args) {
		Thread t1 = new Thread(new Counter("NO1"));
		Thread t2 = new Thread(new Counter("NO2"));
		t1.start();
		t2.start();
	}
}
class Counter implements Runnable{
	
	private String name;
	
	public Counter(String name) {
		this.name = name;
	}
	@Override
	public void run() {
		for(int i =0 ; i<5; i++){
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Thread Name: "+name);
		}
	}
	
}