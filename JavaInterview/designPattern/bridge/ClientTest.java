package bridge;

public class ClientTest {
	public static void main(String[] args) {
		LogitecController controller = new LogitecController(new SonyTV());
		controller.turnOn();
		controller.switchChannel(50);
		controller.turnOff();
	}
}	
