
public class TestObserver {
	public static void main(String[] args) {
		Boss huhansan = new Boss();
		Observer ob1 = new StockObserver("aaa", huhansan);
		Observer ob2 = new StockObserver("bbb", huhansan);
		huhansan.attach(ob1);
		huhansan.attach(ob2);
		huhansan.setAction("胡汉三回来了");
		huhansan.Notify();
	}
}
