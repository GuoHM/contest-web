package dao;

import bean.Normaluser;
import bean.Teaminfo;

public interface INormaluserDao {

	void save(Normaluser user) throws Exception;
	
	Normaluser getNormaluserById(String id) throws Exception;
	
	Normaluser getNormaluserByUser(String user) throws Exception;
	
}
