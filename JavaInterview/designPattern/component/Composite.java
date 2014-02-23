package component;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component {

	private List<Component> children = new ArrayList<Component>();

	public void show() {
		for (Component c : children) {
			c.show();
		}
	}

	public void addComponent(Component c) {
		children.add(c);
	}

	public void removeComponent(Component c){
		children.remove(c);
	}
}
