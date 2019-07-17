package nature;

public class TestState {
	public static void main(String[] args) {
		Context c = new Context(new ConcreteStateA());
		c.Request();
		c.Request();
		c.Request();
		c.Request();
	}
}
