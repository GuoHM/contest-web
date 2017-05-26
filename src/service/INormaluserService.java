package service;

import bean.Normaluser;
import bean.Teaminfo;

public interface INormaluserService {

	void enroll(Teaminfo team) throws Exception;

	void fillInfo(String userid, Normaluser user) throws Exception;
	
	void modifyPassword(String user,String password) throws Exception;	
	

}
