package dao;

import java.util.List;

import bean.School;

public interface ISchoolDao {
	
	List<School> getAll() throws Exception;

}
