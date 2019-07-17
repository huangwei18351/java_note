package state;

public class Work {
	private State current;
	private double hour;
	private boolean finish;
	public Work(){
		current = new ForenoonState();
	}
	public double getHour() {
		return hour;
	}
	public void setHour(double hour) {
		this.hour = hour;
	}
	public boolean isFinish() {
		return finish;
	}
	public void setFinish(boolean finish) {
		this.finish = finish;
	}
	public void setState(State s){
		current = s;
	}
	public void writeProgram(){
		current.writeProgram(this);
	}
}
