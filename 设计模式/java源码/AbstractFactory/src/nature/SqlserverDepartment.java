package nature;

public class SqlserverDepartment implements IDepartment {

	@Override
	public void insert(Department department) {
		// TODO Auto-generated method stub
		System.out.println("SQLSERVER添加department一条记录");
	}

	@Override
	public void getDepartment(int id) {
		// TODO Auto-generated method stub
		System.out.println("取得SQLSERVER中department一条记录");
	}

}
