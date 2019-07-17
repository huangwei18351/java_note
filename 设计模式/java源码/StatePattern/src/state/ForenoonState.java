package state;

public class ForenoonState extends State {

	@Override
	public void writeProgram(Work w) {
		// TODO Auto-generated method stub
		if(w.getHour() < 12){
			System.out.println("当前时间：" + w.getHour() + "点上午工作，精神百倍");
		}else{
			w.setState(new NoonState());
			w.writeProgram();
		}
	}

}
