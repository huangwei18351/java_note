
public class PersonThinBuilder extends PersonBuilder {

	public PersonThinBuilder(String g, String p) {
		// TODO Auto-generated constructor stub
		super(g, p);
	}
	
	@Override
	public void BuildHead() {
		// TODO Auto-generated method stub
		System.out.println(p+" headThin 50 20 30 30");
	}

	@Override
	public void BuildBody() {
		// TODO Auto-generated method stub
		System.out.println(p+ " bodyThin 50 20 30 30");
	}

	@Override
	public void BuildArmLeft() {
		// TODO Auto-generated method stub
		System.out.println(p+ " ArmLeftThin 50 20 30 30");
	}

	@Override
	public void BuildArmRight() {
		// TODO Auto-generated method stub
		System.out.println(p+ " ArmRightThin 50 20 30 30");
	}

	@Override
	public void BuildLegLeft() {
		// TODO Auto-generated method stub
		System.out.println(p+ " LegLeftThin 50 20 30 30");
	}

	@Override
	public void BuildLegRight() {
		// TODO Auto-generated method stub
		System.out.println(p+ " LegRightThin 50 20 30 30");
	}

}
