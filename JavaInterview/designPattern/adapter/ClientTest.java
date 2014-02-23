package adapter;

public class ClientTest {
	public static void main(String[] args) {
		Orange orange = new Orange();
		AppleAdapter aa = new AppleAdapter(orange);
		aa.getAppleColor("Orange");
	}
}
