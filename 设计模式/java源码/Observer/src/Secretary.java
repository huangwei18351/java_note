import java.util.ArrayList;
import java.util.List;


public class Secretary implements Subject{

	//同事列表
	private List<Observer> obs = new ArrayList<Observer>();
	private String action;
	
	@Override
	public void attach(Observer observer) {
		// TODO Auto-generated method stub
		obs.add(observer);
	}

	@Override
	public void detach(Observer observer) {
		// TODO Auto-generated method stub
		obs.remove(observer);
	}

	@Override
	public void Notify() {
		// TODO Auto-generated method stub
		for (Observer observer : obs) {
			observer.update();
		}
	}
	
	//老板状态
	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

}
