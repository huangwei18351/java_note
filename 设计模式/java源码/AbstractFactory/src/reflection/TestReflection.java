package reflection;

import nature.Department;
import nature.IDepartment;
import nature.IUser;
import nature.User;

public class TestReflection {
	public static void main(String[] args) {
		User user = new User();
		Department dept = new Department();
		DataAccess dataAccess = new DataAccess();
		dataAccess.setAssemblyName("SqlserverUser");
		IUser siu = dataAccess.createUser();
		siu.insert(user);
		siu.getUser(1);
		dataAccess.setAssemblyName("SqlserverDepartment");
		IDepartment sid = dataAccess.createDepartment();
		sid.insert(dept);
		sid.getDepartment(1);
		dataAccess.setAssemblyName("AccessUser");
		IUser aiu = dataAccess.createUser();
		aiu.insert(user);
		aiu.getUser(1);
		dataAccess.setAssemblyName("AccessDepartment");
		IDepartment aid = dataAccess.createDepartment();
		aid.insert(dept);
		aid.getDepartment(1);
	}
}
