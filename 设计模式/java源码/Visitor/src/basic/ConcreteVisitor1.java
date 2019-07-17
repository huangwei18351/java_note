package basic;

public class ConcreteVisitor1 extends Visitor {

	@Override
	public void visitConcreteElementA(ConcreteElementA concreteElementA) {
		// TODO Auto-generated method stub
		System.out.println(concreteElementA.toString() + "被" + this.toString() + "访问");
	}

	@Override
	public void visitConcreteElementB(ConcreteElementB concreteElementB) {
		// TODO Auto-generated method stub
		System.out.println(concreteElementB.toString() + "被" + this.toString() + "访问");
	}

}
