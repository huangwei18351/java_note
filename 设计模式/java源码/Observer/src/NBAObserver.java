
public class NBAObserver extends Observer {

	public NBAObserver(String name, Subject sub){
		super(name, sub);
	}
	
	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println(sub.getAction() + "\t" + name + "关闭NBA直播，继续工作");
	}

}
