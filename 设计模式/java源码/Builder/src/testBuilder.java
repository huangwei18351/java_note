
public class testBuilder {
	public static void main(String[] args) {
		PersonThinBuilder ptb = new PersonThinBuilder("g", "黄");
		PersonDirector pdThin = new PersonDirector(ptb);
		pdThin.createPerson();
		
		PersonFatBuilder pfb = new PersonFatBuilder("g", "绿");
		PersonDirector pdFat = new PersonDirector(pfb);
		pdFat.createPerson();
	}
}
