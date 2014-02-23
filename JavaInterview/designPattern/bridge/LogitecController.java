package bridge;

public class LogitecController extends AbstractRemoteController{

	public LogitecController(ITV tv) {
		super(tv);
	}
	
	public void logitecKeyBoardEnter(int channel){
		switchChannel(channel);
	}
}
