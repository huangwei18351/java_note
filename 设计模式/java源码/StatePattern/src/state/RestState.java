package state;

public class RestState extends State {

	@Override
	public void writeProgram(Work w) {
		// TODO Auto-generated method stub
		System.out.println("当前时间：" + w.getHour() + "点下班回家");
	}

}
