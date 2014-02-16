package abstractFactory;

public class IntelFactory implements CPUFactory {

	public CPU produceCPU() {
		return new IntelCPU();
	}

}
