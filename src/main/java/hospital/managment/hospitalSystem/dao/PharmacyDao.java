package Hospital.Managment.HospitalApp.dao;

import java.util.List;

import Hospital.Managment.HospitalApp.model.TDailyAccountOfOperationSection;



public interface PharmacyDao {

	public boolean insertInsertDailyAccountOfOperationSection(TDailyAccountOfOperationSection dailyAccountOfOperationSection);
	public List<TDailyAccountOfOperationSection> getDailyAccountOfOperationSectionList();
}
