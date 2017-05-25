package service;

import bean.Normaluser;
import bean.Teaminfo;

public interface IUserService {


	void enroll(Teaminfo team) throws Exception;

	void fillInfo(String userid, Normaluser user) throws Exception;

}
