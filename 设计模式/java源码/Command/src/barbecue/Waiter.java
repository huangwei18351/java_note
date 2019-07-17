package barbecue;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Waiter {
	private List<Command> orders = new ArrayList<Command>();
	
	public void setOrder(Command command){
		if(command.toString().equals("烤鸡肉")){
			System.out.println("服务员：鸡翅没有了，请点别的");
		}else{
			orders.add(command);
			System.out.println("增加订单：" + command.toString() + " 时间：" + new Date());
		}
	}
	
	public void cancelOrder(Command command){
		orders.remove(command);
		System.out.println("取消订单： " + command.toString() + " 时间： " + new Date());
	}
	
	public void myNotify(){
		for (Command command : orders) {
			command.executeCommand();
		}
	}
}
