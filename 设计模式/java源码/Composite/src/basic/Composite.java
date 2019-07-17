package basic;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component {
	private List<Component> children = new ArrayList<Component>();
	public Composite(String name){
		super(name);
	}
	@Override
	public void add(Component c) {
		// TODO Auto-generated method stub
		children.add(c);
	}

	@Override
	public void remove(Component c) {
		// TODO Auto-generated method stub
		children.remove(c);
	}

	@Override
	public void display(int depth) {
		// TODO Auto-generated method stub
		String str = "";
		for(int i = 0; i < depth; i++){
			str += "-";
		}
		System.out.println(str + name);
		
		for (Component component : children) {
			component.display(depth + 2);
		}
	}

}
