
public class OperationDiv extends Operation{

	@Override
	public double getResult() {
		double result = 0;
		if(getNumberB() == 0){
			try {
				throw new Exception("除数不能为零");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		result = getNumberA() + getNumberB();
		return result;
	}
}
