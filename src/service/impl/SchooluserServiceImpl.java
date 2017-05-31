package service.impl;

import bean.Schooluser;
import dao.ISchooluserDao;
import service.ISchooluserService;

public class SchooluserServiceImpl implements ISchooluserService {
	private ISchooluserDao schoolDao;

	@Override
	public Schooluser getUserByLoginAndPassword(String login, String password) throws Exception {
		// TODO Auto-generated method stub
		boolean isValid = login != null && password != null;
		if(!isValid) {
			return null;
		}
		return schoolDao.getByLoginAndPassword(login, password);
	}

	@Override
	public void save(Schooluser user) throws Exception {
		// TODO Auto-generated method stub
		if(user != null) {
			schoolDao.save(user);
		}
	}
	
	/**
	 * @return the schoolDao
	 */
	public ISchooluserDao getSchoolDao() {
		return schoolDao;
	}

	/**
	 * @param schoolDao the schoolDao to set
	 */
	public void setSchoolDao(ISchooluserDao schoolDao) {
		this.schoolDao = schoolDao;
	}

}
