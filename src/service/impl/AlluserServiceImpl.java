package service.impl;

import bean.LoginInfo;
import bean.Normaluser;
import dao.IAlluserDao;
import dao.INormaluserDao;
import service.IAlluserService;

public class AlluserServiceImpl implements IAlluserService {
	private IAlluserDao alldao;
	private INormaluserDao normaluserdao;

	
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
		normaluserdao.save(user);
	}

	@Override
	public LoginInfo getUserByLoginAndPassword(String login, String password) throws Exception {
		// TODO Auto-generated method stub
		boolean isValid = login != null && password != null;
		if(!isValid) {
			return null;
		}
		return alldao.getByLoginAndPassword(login, password);
	}

	@Override
	public boolean isLoginValid(String login) throws Exception {
		// TODO Auto-generated method stub
		Normaluser user = normaluserdao.getNormaluserByUser(login);
		if(user==null) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * @return the alldao
	 */
	public IAlluserDao getAlldao() {
		return alldao;
	}

	/**
	 * @param alldao the alldao to set
	 */
	public void setAlldao(IAlluserDao alldao) {
		this.alldao = alldao;
	}

	/**
	 * @return the normaluserDao
	 */
	public INormaluserDao getNormaluserDao() {
		return normaluserdao;
	}

	/**
	 * @param normaluserDao the normaluserDao to set
	 */
	public void setNormaluserDao(INormaluserDao normaluserDao) {
		this.normaluserdao = normaluserDao;
	}
	

}
