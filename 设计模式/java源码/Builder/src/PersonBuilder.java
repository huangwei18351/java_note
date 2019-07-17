
public abstract class PersonBuilder {
	protected String g;
	protected String p;
	
	public PersonBuilder(){
		
	}
	
	public PersonBuilder(String g, String p){
		this.g = g;
		this.p = p;
	}
	
	public abstract void BuildHead();
	public abstract void BuildBody();
	public abstract void BuildArmLeft();
	public abstract void BuildArmRight();
	public abstract void BuildLegLeft();
	public abstract void BuildLegRight();
	
}
