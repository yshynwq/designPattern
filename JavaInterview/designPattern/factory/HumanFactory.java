package factory;

public class HumanFactory {
	public static Human createHuman(String m){
		Human p = null;
		if(m.equalsIgnoreCase("BOY")){
			p = new Boy();
		}else if(m.equalsIgnoreCase("GIRL")){
			p = new Girl();
		}
		
		return p;
	}
}
