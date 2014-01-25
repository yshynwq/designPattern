package abstractFactory;

public class ColorFactory extends AbstractFactory {

	@Override
	Color getColor(String color) {
		if(color == null){
			return null;
		}
		if(color.equalsIgnoreCase("Red")){
			return new Red();
		}else if(color.equalsIgnoreCase("Yellow")){
			return new Yellow();
		}
		return null;
	}

	@Override
	Shape getShape(String shape) {
		// TODO Auto-generated method stub
		return null;
	}

}
