package abstractFactory;

public class ShapeFactory extends AbstractFactory {

	@Override
	Color getColor(String color) {
		return null;
	}

	@Override
	Shape getShape(String shape) {
		if (shape == null) {
			return null;
		}
		if (shape.equalsIgnoreCase("Rectangle")) {
			return new Rectangle();
		} else if (shape.equalsIgnoreCase("Square")) {
			return new Square();
		}
		return null;
	}

}
