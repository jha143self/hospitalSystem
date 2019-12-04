package Hospital.Managment.HospitalApp.dao;

import Hospital.Managment.HospitalApp.model.TUser;

public interface UserDao {

	public TUser getUserByLoginID(String LoginID);
	public TUser getUserByEmployeeID(String EmployeeId);
}
