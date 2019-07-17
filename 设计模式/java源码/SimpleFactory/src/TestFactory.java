
public class TestFactory {
	public static void main(String[] args) {
		Operation oper;
		oper = OperationFactory.createOperation("+");
		oper.setNumberA(1);
		oper.setNumberB(2);
		System.out.println(oper.getResult());
	}
}
