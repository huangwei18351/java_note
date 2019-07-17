
public class StockObserver extends Observer {

	public StockObserver(String name, Subject sub){
		super(name, sub);
	}
	
	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println(sub.getAction() + "\t" + name + "关闭股票行情，继续工作");
	}

}
