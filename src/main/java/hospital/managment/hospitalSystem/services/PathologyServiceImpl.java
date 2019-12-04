package Hospital.Managment.HospitalApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Hospital.Managment.HospitalApp.dao.PathologyDao;


@Service
public class PathologyServiceImpl implements PathologyService {

	@Autowired
	private PathologyDao pathologyDao;
	
	/*@Override
	public boolean insert(TDailyAccountOfOperationSection dailyAccountOfOperationSection) {

		return pathologyDao.insert(dailyAccountOfOperationSection);
	}

	@Override
	public List<TDailyAccountOfOperationSection> getDailyAccountOfOperationSectionList() {
		
		return pathologyDao.getDailyAccountOfOperationSectionList();
	}*/
}
