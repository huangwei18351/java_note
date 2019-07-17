package barbecue;

public abstract class Command {
	protected Barbecue receiver;
	public Command(Barbecue receiver){
		this.receiver = receiver;
	}
	public abstract void executeCommand();
}
