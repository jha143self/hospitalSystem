package Hospital.Managment.HospitalApp.dao;

import Hospital.Managment.HospitalApp.model.TUser;

public interface CustomUserDetailsDao {

	public TUser getUserByLoginID(String loginID);
}
