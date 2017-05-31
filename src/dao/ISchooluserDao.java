package dao;

import bean.Schooluser;

public interface ISchooluserDao {
	
	Schooluser getSchooluserByUserid(String id) throws Exception;
	
	Schooluser getByLoginAndPassword(String login,String password) throws Exception;

	void save(Schooluser user) throws Exception;

}
