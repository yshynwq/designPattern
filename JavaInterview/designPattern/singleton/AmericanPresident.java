package singleton;

public class AmericanPresident {
	private static volatile AmericanPresident thePresident;

	private AmericanPresident() {
	}
	
	public static AmericanPresident getPresident(){
		if(thePresident==null){
			synchronized (AmericanPresident.class) {
				if(thePresident == null){
					thePresident = new AmericanPresident();
				}
			}
		}
		return thePresident;
	}
}
