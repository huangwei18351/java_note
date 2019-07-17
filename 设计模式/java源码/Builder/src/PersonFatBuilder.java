
public class PersonFatBuilder extends PersonBuilder {

	public PersonFatBuilder(String g, String p) {
		// TODO Auto-generated constructor stub
		super(g, p);
	}
	
	@Override
	public void BuildHead() {
		// TODO Auto-generated method stub
		System.out.println(p+ " headFat 50 20 30 30");
	}

	@Override
	public void BuildBody() {
		// TODO Auto-generated method stub
		System.out.println(p+ " bodyFat 50 20 30 30");
	}

	@Override
	public void BuildArmLeft() {
		// TODO Auto-generated method stub
		System.out.println(p+ " ArmLeftFat 50 20 30 30");
	}

	@Override
	public void BuildArmRight() {
		// TODO Auto-generated method stub
		System.out.println(p+ " ArmRightFat 50 20 30 30");
	}

	@Override
	public void BuildLegLeft() {
		// TODO Auto-generated method stub
		System.out.println(p+ " LegLeftFat 50 20 30 30");
	}

	@Override
	public void BuildLegRight() {
		// TODO Auto-generated method stub
		System.out.println(p+ " LegRightFat 50 20 30 30");
	}

}
