package basic;

public class ConcreteHandler2 extends Handler {
	
	@Override
	public void handleRequest(int request) {
		// TODO Auto-generated method stub
		if(request >= 20 && request < 30){
			System.out.println(this.toString() + "处理请求" + request);
		}else if(successor != null){
			successor.handleRequest(request);
		}
	}

}
