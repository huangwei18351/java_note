package music;

public class NoteTerminalExpression extends Expression {

	@Override
	public void execute(String key, double value) {
		// TODO Auto-generated method stub
		String note = "";
		switch (key) {
		case "c":
			note = "1";
			break;

		case "d":
			note = "2";
			break;

		case "e":
			note = "3";
			break;

		case "f":
			note = "4";
			break;

		case "g":
			note = "5";
			break;

		case "a":
			note = "6";
			break;

		case "b":
			note = "7";
			break;

		}
		System.out.println(note);
	}

}
