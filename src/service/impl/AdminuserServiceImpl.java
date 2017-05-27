package service.impl;

import bean.Adminuser;
import dao.IAdminuserDao;
import service.IAdminuserService;

public class AdminuserServiceImpl implements IAdminuserService {
	private IAdminuserDao adminDao;
	
	/**
	 * @return the adminDao
	 */
	public IAdminuserDao getAdminDao() {
		return adminDao;
	}

	/**
	 * @param adminDao the adminDao to set
	 */
	public void setAdminDao(IAdminuserDao adminDao) {
		this.adminDao = adminDao;
	}

	@Override
	public Adminuser getUserByLoginAndPassword(String login, String password) throws Exception {
		// TODO Auto-generated method stub
		boolean isValid = login != null && password != null;
		if(!isValid) {
			return null;
		}
		return adminDao.getByLoginAndPassword(login, password);
	}

}
