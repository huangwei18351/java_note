package state;

public class EveningState extends State {

	@Override
	public void writeProgram(Work w) {
		// TODO Auto-generated method stub
		if(w.isFinish()){
			w.setState(new RestState());
			w.writeProgram();
		}else{
			if(w.getHour() < 21){
				System.out.println("当前时间：" + w.getHour() + "点，加班哦，疲惫至极");
			}else{
				w.setState(new SleepingState());
				w.writeProgram();
			}
		}
	}

}
