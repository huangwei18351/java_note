
public class Finery extends Person{
	protected Person person;
	//打扮
	public void Decorate(Person person){
		this.person = person;
	}
	
	@Override
	public void show() {
		// TODO Auto-generated method stub
		if(person != null){
			person.show();
		}
	}
}
