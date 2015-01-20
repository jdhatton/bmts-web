package services;

import java.util.List;

import data.db.beans.District;
import data.db.beans.School;

public interface SchoolSearch {
	
	public List<District> findSchoolDistricts(String zipCode);
	
	public List<School> findSchoolsInDistrict(District schoolDistrict);

}
