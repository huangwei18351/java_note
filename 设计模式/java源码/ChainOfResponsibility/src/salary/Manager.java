package salary;

public abstract class Manager {
	protected String name;
	protected Manager superior;
	public Manager(String name){
		this.name = name;
	}
	
	//设置管理者的上级
	public void setSuperior(Manager superior){
		this.superior = superior;
	}
	
	//申请请求
	public abstract void requestApplication(Request request);
}
