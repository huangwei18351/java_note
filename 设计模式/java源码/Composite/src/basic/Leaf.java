package basic;

public class Leaf extends Component {
	public Leaf(String name){
		super(name);
	}
	@Override
	public void add(Component c) {
		// TODO Auto-generated method stub
		System.out.println("cannot add to a leaf");
	}

	@Override
	public void remove(Component c) {
		// TODO Auto-generated method stub
		System.out.println("cannot remove from a leaf");
	}

	@Override
	public void display(int depth) {
		// TODO Auto-generated method stub
		String str = "";
		for(int i = 0; i < depth; i++){
			str += "-";
		}
		System.out.println(str + name);
	}

}
