package basic;

public class TestComposite {
	public static void main(String[] args) {
		Composite root = new Composite("root");
		root.add(new Leaf("leaf A"));
		root.add(new Leaf("leaf B"));
		
		Composite comp = new Composite("Composite X");
		comp.add(new Leaf("leaf XA"));
		comp.add(new Leaf("leaf XB"));
		
		root.add(comp);
		
		Composite comp2 = new Composite("Composite XY");
		comp2.add(new Leaf("leaf XyA"));
		comp2.add(new Leaf("leaf XyB"));
		
		comp.add(comp2);
		
		root.add(new Leaf("leaf C"));
		
		Leaf leaf = new Leaf("Leaf D");
		root.add(leaf);
		root.remove(leaf);
		
		root.display(1);
	}
}
