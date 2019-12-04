package Hospital.Managment.HospitalApp.service;

import java.util.List;

import Hospital.Managment.HospitalApp.model.TDailyAccountOfOperationSection;



public interface PharmacyService {

	public boolean insertInsertDailyAccountOfOperationSection(TDailyAccountOfOperationSection dailyAccountOfOperationSection);
	public List<TDailyAccountOfOperationSection> getDailyAccountOfOperationSectionList();
}
