package bridge;

public class SamsungTV implements ITV{

	@Override
	public void off() {
		// TODO Auto-generated method stub

		System.out.println("Samsung TV is off.");
	}

	@Override
	public void on() {
		// TODO Auto-generated method stub
		System.out.println("Samsung TV is on.");
		
	}

	@Override
	public void switchChannel(int channel) {
		// TODO Auto-generated method stub
		System.out.println("Samsung TV changed to channel "+channel);
		
	}
	
}
