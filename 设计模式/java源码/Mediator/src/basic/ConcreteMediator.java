package basic;

public class ConcreteMediator extends Mediator{
	private ConcreteColleague1 colleague1;
	private ConcreteColleague2 colleague2;
	
	public void setConcreteColleague1(ConcreteColleague1 colleague){
		this.colleague1 = colleague;
	}
	
	public void setConcreteColleague2(ConcreteColleague2 colleague){
		this.colleague2 = colleague;
	}

	@Override
	public void send(String message, Colleague colleague) {
		// TODO Auto-generated method stub
		if(colleague == colleague1){
			colleague2.myNotify(message);
		}else{
			colleague1.myNotify(message);
		}
	}
	
}
