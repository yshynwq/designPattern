package bridge;

public class SonyTV implements ITV {

	@Override
	public void off() {
		// TODO Auto-generated method stub
		System.out.println("Sony TV is off.");
	}

	@Override
	public void on() {
		// TODO Auto-generated method stub
		System.out.println("Sony TV is on.");
	}

	@Override
	public void switchChannel(int channel) {
		// TODO Auto-generated method stub
		System.out.println("Sony TV changed to channel "+channel);
	}

}
