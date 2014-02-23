package strategy;

public class ClientTest {
	public static void main(String[] args) {
		BadPolice bp = new BadPolice();
		NicePolice np= new NicePolice();
		
		Situation s1= new Situation(bp);
		Situation s2 = new Situation(np);
		
		s1.handleByPolice(10);
		s2.handleByPolice(10);
		
	}
}
