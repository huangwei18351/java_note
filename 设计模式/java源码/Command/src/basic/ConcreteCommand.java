package basic;

public class ConcreteCommand extends Command {
	public ConcreteCommand(Receiver receiver){
		super(receiver);
	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		receiver.action();
	}

}
