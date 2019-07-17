package Person;

public class Amativeness extends Action {

	@Override
	public void getManConclusion(Man concreteElementA) {
		// TODO Auto-generated method stub
		System.out.println(concreteElementA.getName() + this.toString() + "时，凡是不懂也要装懂");
	}

	@Override
	public void getWomanConclusion(Woman concreteElementA) {
		// TODO Auto-generated method stub
		System.out.println(concreteElementA.getName() + this.toString() + "时，遇事懂也不懂");
	}

}
