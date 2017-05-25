package dao;

import bean.Schooluser;

public interface ISchooluserDao {
	
	Schooluser getSchooluserById(String id) throws Exception;

}
