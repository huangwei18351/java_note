package nature;

public class TestAF {
	public static void main(String[] args) {
		User user = new User();
		Department dept = new Department();
		
		Factory Sfactory = new SqlServerFactory();
		Factory Afactory = new AccessFactory();
		IUser siu = Sfactory.createUser();
		siu.insert(user);
		siu.getUser(1);
		IDepartment sid = Sfactory.createDepartment();
		sid.insert(dept);
		sid.getDepartment(1);
		IUser aiu = Afactory.createUser();
		aiu.insert(user);
		aiu.getUser(1);
		IDepartment aid = Afactory.createDepartment();
		aid.insert(dept);
		aid.getDepartment(1);
		
	}
}
