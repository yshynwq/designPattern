package builder;

public class Waiter {
	private StarbucksBuilder starbucksBuilder;
	public void setStarbucksBuilder(StarbucksBuilder builder){
		starbucksBuilder = builder;
	}
	
	public Starbucks getStarbucksDrink(){
		return starbucksBuilder.getStarbucks();
	}
	
	public void constructStarbucks(){
		starbucksBuilder.createStarbucks();
		starbucksBuilder.buildDrink();
		starbucksBuilder.buildSize();
	}
}
