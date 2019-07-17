package leifengFactoryMethod;

import leifengSimpleFactory.LeiFeng;

public class TestFactoryMethod {
	public static void main(String[] args) {
		IFactory factory = new UnderGraduateFactory();
		LeiFeng student = factory.CreateLeiFeng();
		student.BuyRice();
		student.sweep();
		student.wash();
	}
}
