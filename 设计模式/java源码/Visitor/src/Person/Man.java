package Person;

public class Man extends Person {
	
	public Man(String name) {
		super(name);
	}

	@Override
	public void accept(Action action) {
		// TODO Auto-generated method stub
		action.getManConclusion(this);
	}

}
