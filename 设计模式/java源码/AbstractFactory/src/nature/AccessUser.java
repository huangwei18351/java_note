package nature;

public class AccessUser implements IUser{

	@Override
	public void insert(User user) {
		// TODO Auto-generated method stub
		System.out.println("在Access 中添加user表的一条记录");
	}

	@Override
	public void getUser(int id) {
		// TODO Auto-generated method stub
		System.out.println("取得在Access 中user表的一条记录");
	}

}
