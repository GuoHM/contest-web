package service;


import bean.Schooluser;

public interface ISchooluserService {
	
	Schooluser getUserByLoginAndPassword(String login, String password) throws Exception;

}
