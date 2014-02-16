package abstractFactory;

public class AMDFactory implements CPUFactory{

	public CPU produceCPU() {
		return new AMDCPU();
	}
	
}
