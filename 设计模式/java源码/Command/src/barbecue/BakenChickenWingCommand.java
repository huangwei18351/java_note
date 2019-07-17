package barbecue;

public class BakenChickenWingCommand extends Command {
	public BakenChickenWingCommand(Barbecue receiver){
		super(receiver);
	}
	@Override
	public void executeCommand() {
		// TODO Auto-generated method stub
		receiver.bakeChickenWing();
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "烤鸡肉";
	}
}
