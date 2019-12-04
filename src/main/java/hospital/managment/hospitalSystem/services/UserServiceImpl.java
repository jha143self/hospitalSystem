package Hospital.Managment.HospitalApp.service;

import org.springframework.beans.factory.annotation.Autowired;

import Hospital.Managment.HospitalApp.dao.UserDao;
import Hospital.Managment.HospitalApp.model.TUser;



public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;
	@Override
	public TUser getUserByLoginID(String LoginID) {
		
		return userDao.getUserByLoginID(LoginID);
	}
	@Override
	public TUser getUserByEmployeeID(String EmployeeId) {
	
		return userDao.getUserByEmployeeID(EmployeeId);
	}

}
