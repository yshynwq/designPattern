package component;

public class Leaf implements Component {
	private final String name;
	public Leaf(String name) {
		this.name = name;
	}
	public void show() {
		System.out.println("Leaf name is "+name);
	}
}
