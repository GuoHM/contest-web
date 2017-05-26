package service.impl;

import bean.LoginInfo;
import bean.Normaluser;
import dao.IAlluserDao;
import dao.INormaluserDao;
import service.IAlluserService;

public class AlluserServiceImpl implements IAlluserService {
	private IAlluserDao allDao;
	private INormaluserDao normaluserDao;

	
	/**
	 * @Method: addUser 
	 * @Description: add a normaluser to the normaluser table
	 * @param user
	 * @throws Exception 
	 * @see service.IAlluserService#addUser(bean.Normaluser) 
	 */
	@Override
	public void addUser(Normaluser user) throws Exception {
		// TODO Auto-generated method stub
		boolean isValid = user != null && user.getUserId() != null && !"".equals(user.getUserId())
				&& user.getPassword() != null && !"".equals(user.getPassword());
		if(!isValid) {
			return;
		}
		normaluserDao.save(user);
	}

	@Override
	public LoginInfo getUserByLoginAndPassword(String login, String password) throws Exception {
		// TODO Auto-generated method stub
		boolean isValid = login != null && password != null;
		if(!isValid) {
			return null;
		}
		return allDao.getByLoginAndPassword(login, password);
	}

	@Override
	public boolean isLoginValid(String login) throws Exception {
		// TODO Auto-generated method stub
		Normaluser user = normaluserDao.getNormaluserByUserid(login);
		if(user==null) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * @return the allDao
	 */
	public IAlluserDao getAllDao() {
		return allDao;
	}

	/**
	 * @param allDao the allDao to set
	 */
	public void setAllDao(IAlluserDao allDao) {
		this.allDao = allDao;
	}

	/**
	 * @return the normaluserDao
	 */
	public INormaluserDao getNormaluserDao() {
		return normaluserDao;
	}

	/**
	 * @param normaluserDao the normaluserDao to set
	 */
	public void setNormaluserDao(INormaluserDao normaluserDao) {
		this.normaluserDao = normaluserDao;
	}

}
