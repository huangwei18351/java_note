package nature;

public class AccessDepartment implements IDepartment {

	@Override
	public void insert(Department department) {
		// TODO Auto-generated method stub
		System.out.println("Access添加department一条记录");
	}

	@Override
	public void getDepartment(int id) {
		// TODO Auto-generated method stub
		System.out.println("取得Access中department一条记录");
	}

}
