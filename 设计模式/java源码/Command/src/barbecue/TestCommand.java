package barbecue;

public class TestCommand {
	public static void main(String[] args) {
		Barbecue boy = new Barbecue();
		Command bakeMuttonCommand = new BakeMuttonCommand(boy);
		Command bakeMuttonCommand2 = new BakeMuttonCommand(boy);
		Command bakeChickenWingCommand = new BakenChickenWingCommand(boy);
		Waiter girl = new Waiter();
		
		girl.setOrder(bakeMuttonCommand);
		girl.setOrder(bakeMuttonCommand2);
		girl.setOrder(bakeChickenWingCommand);
		
		girl.myNotify();
	}
}
