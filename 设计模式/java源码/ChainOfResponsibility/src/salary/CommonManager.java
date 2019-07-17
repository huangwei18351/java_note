package salary;

public class CommonManager extends Manager {

	public CommonManager(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void requestApplication(Request request) {
		// TODO Auto-generated method stub
		if(request.getRequestType() == "请假" && request.getNumber() <= 2){
			System.out.println(name + ":" + request.getRequestContent() + "数量" + request.getNumber() + "被批准");
		}else{
			if(superior != null){
				superior.requestApplication(request);
			}
		}
	}

}
