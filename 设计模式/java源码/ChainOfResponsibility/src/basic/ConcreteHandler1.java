package basic;

public class ConcreteHandler1 extends Handler {
	
	@Override
	public void handleRequest(int request) {
		// TODO Auto-generated method stub
		if(request >= 10 && request < 20){
			System.out.println(this.toString() + "处理请求" + request);
		}else if(successor != null){
			successor.handleRequest(request);
		}
	}

}
