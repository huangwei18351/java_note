package basic;

public abstract class Command {
	protected Receiver receiver;
	public Command(Receiver receiver){
		this.receiver = receiver;
	}
	public abstract void execute();
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}
