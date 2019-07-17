package basic;

public class TestBasicMediator {
	public static void main(String[] args) {
		Mediator mediator = new ConcreteMediator();
		ConcreteColleague1 c1 = new ConcreteColleague1(mediator);
		ConcreteColleague2 c2 = new ConcreteColleague2(mediator);
		
		mediator.setConcreteColleague1(c1);
		mediator.setConcreteColleague2(c2);
		
		c1.send("吃过饭了吗？");
		c2.send("没有呢，你打算请客？");
	}
}
