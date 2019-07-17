
public class Resume implements Cloneable {
	private String name;
	private String sex;
	private String age;
	private String timeArea;
	private String company;
	
	public Resume(String name){
		this.name = name;
	}
	
	public void setPersonInfo(String sex, String age){
		this.sex = sex;
		this.age = age;
	}
	
	public void setWorkExperience(String timeArea, String company){
		this.timeArea = timeArea;
		this.company = company;
	}
	
	public void Display(){
		System.out.println(name + "\t" + sex + "\t" + age);
		System.out.println("工作经历：" + timeArea +".." + company);
	}
	
	public Object Clone(){
		try {
			return (Object)this.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
