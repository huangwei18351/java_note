package deepCopy;
/**
 * 浅复制
 * @author sshss
 *
 */
public class TestDeepCopy {
	public static void main(String[] args) {
		Resume a = new Resume("大鸟");
		a.setPersonInfo("男", "29");
		a.setWorkExperience("1998-2000", "xx公司");
		Resume b = (Resume)a.Clone();
		b.setWorkExperience("1998-2006", "xx企业");
		Resume c = (Resume)a.Clone();
		c.setPersonInfo("男", "24");
		a.Display();
		b.Display();
		c.Display();
	}
}
