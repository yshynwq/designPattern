package decorator;

public class Science extends GirlDecorator{
	private Girl girl;
	
	public Science(Girl g) {
		this.girl = g;
	}
	
	public String getDescription() {
		return girl.getDescription()+" Like Science";
	}
	
	public void calStuff(){
		System.out.println("Science Calculate");
	}

}
