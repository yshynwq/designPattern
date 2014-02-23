package observer;

public class ClientTest {
	public static void main(String[] args) {
		HeadHunter hh = new HeadHunter();
		hh.registerObserver(new JobSeeker("Mike"));
		hh.registerObserver(new JobSeeker("Chris"));
		hh.registerObserver(new JobSeeker("Jeff"));
		
		hh.addJob("Yahoo Job");
		hh.addJob("Google Job");
	}
}
