
public class CashReturn extends CashSuper {

	private double moneyCondition = 0.0d;
	private double moneyReturn = 0.0d;
	
	public CashReturn(String moneyCondition, String moneyReturn){
		this.moneyCondition = Double.parseDouble(moneyCondition);
		this.moneyReturn = Double.parseDouble(moneyReturn);
	}
	
	@Override
	public double acceptCash(double money) {
		// TODO Auto-generated method stub
		double result = money;
		if(money >= moneyCondition){
			result = money - Math.floor(money / moneyCondition) * moneyReturn;//FLOOR求一个浮点数的地板,就是求一个最接近它的整数,它的值小于或等于这个浮点数
		}
		return result;
	}

}
