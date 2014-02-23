package prototype;

public class ClientTest {
	public static void main(String[] args) {
		A a = new A();
		a.setSize(0);
		for(int i=1; i<10; i++){
			A tmp;
			try {
				tmp = a.clone();
				tmp.setSize(i);
				tmp.printSize();
			} catch (CloneNotSupportedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
