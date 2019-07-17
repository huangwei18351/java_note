package Person;

public class Woman extends Person {

	public Woman(String name) {
		super(name);
	}

	@Override
	public void accept(Action action) {
		// TODO Auto-generated method stub
		action.getWomanConclusion(this);
	}

}
