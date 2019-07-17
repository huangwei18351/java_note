package mobilePhone;

public abstract class HandSetBrand {
	protected HandSetSoft soft;
	//设置手机软件
	public void setHandSetSoft(HandSetSoft soft){
		this.soft = soft;
	}
	//运行
	public abstract void run();
}
