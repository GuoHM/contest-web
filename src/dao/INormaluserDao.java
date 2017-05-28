package dao;

import bean.Normaluser;

public interface INormaluserDao {

	void save(Normaluser user) throws Exception;

	Normaluser getNormaluserById(String id) throws Exception;

	Normaluser getNormaluserByUserid(String user) throws Exception;

	Normaluser getByLoginAndPasswrod(String login, String password) throws Exception;

}
