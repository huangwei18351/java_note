package leifengSimpleFactory;

public class SimpleFactory {
	public static LeiFeng CreateLeiFeng(String type){
		LeiFeng leifeng = null;
		switch(type){
		case "学雷锋的大学生":
			leifeng = new UnderGraduate();
			break;
		case "志愿者":
			leifeng = new Volunteer();
			break;
		}
		return leifeng;
	}
}
