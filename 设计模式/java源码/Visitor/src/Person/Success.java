package Person;

public class Success extends Action {

	@Override
	public void getManConclusion(Man concreteElementA) {
		// TODO Auto-generated method stub
		System.out.println(concreteElementA.getName() + this.toString() + "时，背后多半有一个伟大的女人");
	}

	@Override
	public void getWomanConclusion(Woman concreteElementB) {
		// TODO Auto-generated method stub
		System.out.println(concreteElementB.getName() + this.toString() + "时，背后多半有一个不成功的男人");
	}

}
