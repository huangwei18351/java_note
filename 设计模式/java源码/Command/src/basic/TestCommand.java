package basic;

public class TestCommand {
	public static void main(String[] args) {
		Receiver r = new Receiver();
		Command c = new ConcreteCommand(r);
		Invoke i = new Invoke();
		i.setCommand(c);
		i.executeCommand();
	}
}
