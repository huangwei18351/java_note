package Person;

public class Failing extends Action {

	@Override
	public void getManConclusion(Man concreteElementA) {
		// TODO Auto-generated method stub
		System.out.println(concreteElementA.getName() + this.toString() + "时，闷头喝酒，谁也劝不了");
	}

	@Override
	public void getWomanConclusion(Woman concreteElementA) {
		// TODO Auto-generated method stub
		System.out.println(concreteElementA.getName() + this.toString() + "时，眼泪汪汪，谁也劝不了");
	}

}
