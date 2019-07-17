package barbecue;

public class BakeMuttonCommand extends Command {
	public BakeMuttonCommand(Barbecue receiver){
		super(receiver);
	}
	@Override
	public void executeCommand() {
		// TODO Auto-generated method stub
		receiver.bakeMutton();
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "烤羊肉";
	}

}
