package basic;

public abstract class Mediator {
	public abstract void send(String message, Colleague colleague);
	public abstract void setConcreteColleague1(ConcreteColleague1 colleague);
	public abstract void setConcreteColleague2(ConcreteColleague2 colleague);
}
