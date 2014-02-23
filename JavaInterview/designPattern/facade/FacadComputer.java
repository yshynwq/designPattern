package facade;

public class FacadComputer {
	private CPU cpu;
	private Memory memory;
	private HardDriver hardDriver;
	
	public FacadComputer() {
		this.cpu = new CPU();
		this.memory = new Memory();
		this.hardDriver = new HardDriver();
	}
	
	public void run(){
		memory.load();
		hardDriver.readdata();
		cpu.processData();
	}
}
