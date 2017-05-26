package dao;

import bean.LoginInfo;

public interface IAlluserDao {

	LoginInfo getByLoginAndPassword(String login, String password) throws Exception;
	

}
