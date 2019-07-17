package basic;

public class TestIterator {
	public static void main(String[] args) {
		ConcreteAggregate ca = new ConcreteAggregate();
		ca.setObject(0, "大鸟");
		ca.setObject(1, "小菜");
		ca.setObject(2, "行李");
		ca.setObject(3, "老外");
		ca.setObject(4, "员工");
		ca.setObject(5, "小偷");
		
		Iterator i = new ConcreteIterator(ca);
		Object item = i.first();
		while(!i.isDone()){
			System.out.println(i.currentItem() + " 请买车票");
			i.next();
		}
	}
}
