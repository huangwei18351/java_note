/**
 * 与纯策略模式的区别就是，实例化cashSuper的时候需要传入CashSuper，cashsuper需要客户端生成，而与工厂结合之后直接在弓工厂里面生成，减少了客户端的压力
 * @author sshss
 *
 */
public class CashContextWithFactory {
	private CashSuper cs = null;
	public CashContextWithFactory(String type){
		switch(type){
			case "正常收费":
				CashNormal cNormal = new CashNormal();
				cs = cNormal;
				break;
			case "满300减100":
				CashReturn cReturn = new CashReturn("300","100");
				cs = cReturn;
				break;
			case "大8折":
				CashRebate cRebate = new CashRebate("0.8");
				cs = cRebate;
				break;
				
		}
	}
	public double GetResult(double money){
		return cs.acceptCash(money);
	}
}
