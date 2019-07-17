
public class TestDecorator {
	public static void main(String[] args) {
		Person person = new Person("hw");
		System.out.println("装饰1");
		TShirts tixu = new TShirts();
		BigTrouser kuaiku = new BigTrouser();
		Sneaker poqiuxie = new Sneaker();
		tixu.Decorate(person);
		kuaiku.Decorate(tixu);
		poqiuxie.Decorate(kuaiku);
		
		poqiuxie.show();
	}
}
