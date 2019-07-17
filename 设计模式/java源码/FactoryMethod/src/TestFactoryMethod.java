
public class TestFactoryMethod {
	public static void main(String[] args) {
		IFactory operFactory = new AddFactory();
		Operation oper = operFactory.CreateOperation();
		oper.setNumberA(1);
		oper.setNumberB(2);
		System.out.println(oper.getResult());
	}
}
