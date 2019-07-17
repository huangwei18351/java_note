package basic;

public class TestChainOfResponsibility {
	public static void main(String[] args) {
		Handler h1 = new ConcreteHandler();
		Handler h2 = new ConcreteHandler1();
		Handler h3 = new ConcreteHandler2();
		h1.setSuccessor(h2);
		h2.setSuccessor(h3);
		
		int[] requests = {2, 5, 14, 22, 18, 3, 27, 20};
		
		for (int i : requests) {
			h1.handleRequest(i);
		}
	}
}
