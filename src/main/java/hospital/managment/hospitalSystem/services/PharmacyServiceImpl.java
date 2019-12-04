package Hospital.Managment.HospitalApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Hospital.Managment.HospitalApp.dao.PharmacyDao;
import Hospital.Managment.HospitalApp.model.TDailyAccountOfOperationSection;


@Service
public class PharmacyServiceImpl implements PharmacyService {

	@Autowired
	private PharmacyDao pharmacyDao;
	
	@Override
	public boolean insertInsertDailyAccountOfOperationSection(TDailyAccountOfOperationSection dailyAccountOfOperationSection) {

		return pharmacyDao.insertInsertDailyAccountOfOperationSection(dailyAccountOfOperationSection);
	}

	@Override
	public List<TDailyAccountOfOperationSection> getDailyAccountOfOperationSectionList() {
		
		return pharmacyDao.getDailyAccountOfOperationSectionList();
	}

}
