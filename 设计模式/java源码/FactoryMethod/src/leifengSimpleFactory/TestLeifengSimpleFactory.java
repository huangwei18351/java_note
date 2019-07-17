package leifengSimpleFactory;

public class TestLeifengSimpleFactory {
	public static void main(String[] args) {
		LeiFeng a = SimpleFactory.CreateLeiFeng("学雷锋的大学生");
		a.BuyRice();
		LeiFeng b = SimpleFactory.CreateLeiFeng("学雷锋的大学生");
		b.sweep();
		LeiFeng c = SimpleFactory.CreateLeiFeng("学雷锋的大学生");
		c.wash();
		
	}
}
