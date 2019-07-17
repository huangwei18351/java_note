package music;

public class TestInterpreter {
	public static void main(String[] args) {
		PlayContext context = new PlayContext();
		System.out.println("上海滩：");
		context.setText("o 2 e 0.5 g 0.5 a 3 e 0.5 g 0.5 d 3 e 0.5 g 0.5 a 0.5 o 3 c 1 o 2 a 0.5 g 1 c 0.5 e 0.5 d 3 ");
		Expression expression = null;
		try {
			while (context.getText().length() > 0) {
				String str = context.getText().substring(0, 1);
				switch (str) {
				case "o":
					expression = new ScaleTerminalExpression();
					break;
				case "c":
				case "d":
				case "e":
				case "f":
				case "g":
				case "h":
				case "a":
				case "b":
				case "p":
					expression = new NoteTerminalExpression();
					break;
				}
				expression.interpret(context);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}
}
