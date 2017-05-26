package dao;

import bean.Schooluser;

public interface ISchooluserDao {
	
	Schooluser getSchooluserByUserid(String id) throws Exception;

}
