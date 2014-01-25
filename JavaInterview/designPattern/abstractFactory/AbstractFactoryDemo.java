package abstractFactory;

public class AbstractFactoryDemo {
	public static void main(String[] args) {
		AbstractFactory shapeFactory = FactoryProducer.getFactory("shape");
		Shape shape = shapeFactory.getShape("Square");
		shape.draw();
		AbstractFactory colorFactory = FactoryProducer.getFactory("color");
		Color color = colorFactory.getColor("red");
		color.fill();
	}
}
