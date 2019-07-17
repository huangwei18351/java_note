
public class Translater extends Player {

	private ForeignCenter yaoming = new ForeignCenter();
	
	public Translater(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		yaoming.jingong();
	}

	@Override
	public void defense() {
		// TODO Auto-generated method stub
		yaoming.fangshou();
	}

	
}
