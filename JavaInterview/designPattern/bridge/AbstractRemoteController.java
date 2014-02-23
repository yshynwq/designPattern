package bridge;

public abstract class AbstractRemoteController {
	private ITV tv;
	public AbstractRemoteController(ITV tv) {
		this.tv = tv;
	}
	
	public void turnOff(){
		tv.off();
	}
	
	public void turnOn(){
		tv.on();
	}
	
	public void switchChannel(int channel){
		tv.switchChannel(channel);
	}
}
