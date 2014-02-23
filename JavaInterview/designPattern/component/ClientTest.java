package component;

public class ClientTest {
	public static void main(String[] args) {
		Leaf leaf1 = new Leaf("1");
		Leaf leaf2 = new Leaf("2");
		Leaf leaf3 = new Leaf("3");
		Leaf leaf4 = new Leaf("4");
		Leaf leaf5 = new Leaf("5");
		Composite composite = new Composite();
		composite.addComponent(leaf1);
		composite.addComponent(leaf2);

		Composite composite2 = new Composite();
		composite2.addComponent(leaf3);
		composite2.addComponent(leaf4);
		composite2.addComponent(leaf5);
		
		composite.addComponent(composite);
		composite.show();
	}
}
