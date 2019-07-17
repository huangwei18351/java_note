package nature;

public class AccessFactory implements Factory {

	@Override
	public IUser createUser() {
		// TODO Auto-generated method stub
		return new AccessUser();
	}

	@Override
	public IDepartment createDepartment() {
		// TODO Auto-generated method stub
		return new AccessDepartment();
	}

}
