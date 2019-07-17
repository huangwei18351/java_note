package state;

public class TestState {
	public static void main(String[] args) {
		Work emergency = new Work();
		emergency.setHour(9);
		emergency.writeProgram();
		emergency.setHour(10);
		emergency.writeProgram();
		emergency.setHour(12);
		emergency.writeProgram();
		emergency.setHour(13);
		emergency.writeProgram();
		emergency.setHour(14);
		emergency.writeProgram();
		emergency.setHour(17);
		emergency.writeProgram();
		emergency.setFinish(false);
		emergency.writeProgram();
		emergency.setHour(19);
		emergency.writeProgram();
		emergency.setHour(22);
		emergency.writeProgram();
		
	}
}
