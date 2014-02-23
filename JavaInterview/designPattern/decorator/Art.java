package decorator;

public class Art extends GirlDecorator {
	private Girl girl;

	public Art(Girl g) {
		this.girl = g;
	}
	
	public String getDescription() {
		return girl.getDescription() +" like art";
	}
	
	public void draw(){
		System.out.println("Draw something.");
	}
}
