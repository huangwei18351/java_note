package Person;

public class TestVisitor {
	public static void main(String[] args) {
		ObjectStructure o = new ObjectStructure();
		o.attach(new Man("男人"));
		o.attach(new Woman("女人"));
		
		Success v1 = new Success();
		o.display(v1);
		
		Failing v2 = new Failing();
		o.display(v2);
		
		Amativeness v3 = new Amativeness();
		o.display(v3);
		
	}
}
