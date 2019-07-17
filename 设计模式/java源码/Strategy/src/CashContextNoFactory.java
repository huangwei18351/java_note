/**
 * 策略模式解析：
 * 是一种定义一系列算法的方法，从概念上看，所有这些算法完成的都是相同的工作，只是实现不同，他可以以相同方式调用所有的算法，减少了各种算法类与
 * 使用算法类之间的耦合。
 * 策略模式的strategy类层次（就是那个父类）为context定义了一系列可充用的算法或者行为，继承有助于析取出这些算法中的公共功能
 * 策略模式的优点：简化了单元测试，因为每个算法都有自己的类，可以通过自己的接口进行单独测试
 * 策略模式可以用来封装他几乎任何类型的规则，只要在分析过程中听到需要在不同时间应用不同的业务规则，就可以考虑使用策略模式
 * 
 * @author sshss
 *
 */
public class CashContextNoFactory {
	private CashSuper cs;
	public CashContextNoFactory(CashSuper csuper){
		this.cs = csuper;
	}
	public double GetResult(double money){
		return cs.acceptCash(money);
	}
}
