package service;

import bean.LoginInfo;
import bean.Normaluser;

public interface IAlluserService {
	void addUser(Normaluser user) throws Exception;

	LoginInfo getUserByLoginAndPassword(String login, String password) throws Exception;

	boolean isLoginValid(String login) throws Exception;

}
