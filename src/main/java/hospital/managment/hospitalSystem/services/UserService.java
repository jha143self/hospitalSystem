package Hospital.Managment.HospitalApp.service;

import Hospital.Managment.HospitalApp.model.TUser;

public interface UserService {

	public TUser getUserByLoginID(String LoginId);
	public TUser getUserByEmployeeID(String EmployeeId);
}
