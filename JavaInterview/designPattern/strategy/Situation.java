package strategy;

public class Situation {
	private Strategy strategy;
	public Situation(Strategy s) {
		this.strategy = s;
	}
	
	public void handleByPolice(int speed){
		this.strategy.processSpeeding(speed);
	}
}
