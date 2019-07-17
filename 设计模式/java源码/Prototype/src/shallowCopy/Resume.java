package shallowCopy;

public class Resume implements Cloneable {
	private String name;
	private String sex;
	private String age; 
	private WorkExperience work;
	
	public Resume(String name){
		this.name = name;
		work = new WorkExperience();
	}
	
	public void setPersonInfo(String sex, String age){
		this.sex = sex;
		this.age = age;
	}
	
	public void setWorkExperience(String workDate, String company){
		work.setWorkDate(workDate);
		work.setCompany(company);
	}
	
	public void Display(){
		System.out.println(name + "\t" + sex + "\t" + age);
		System.out.println("工作经历：" + work.getWorkDate() +".." + work.getCompany());
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
