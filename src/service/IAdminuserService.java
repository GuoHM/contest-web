package service;

import bean.Adminuser;

public interface IAdminuserService {
	
	Adminuser getUserByLoginAndPassword(String login, String password) throws Exception;

}