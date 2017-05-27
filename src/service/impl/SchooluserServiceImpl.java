package service.impl;

import bean.Schooluser;
import dao.ISchooluserDao;
import service.ISchooluserService;

public class SchooluserServiceImpl implements ISchooluserService {
	private ISchooluserDao schoolDao;

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



	@Override
	public Schooluser getUserByLoginAndPassword(String login, String password) throws Exception {
		// TODO Auto-generated method stub
		boolean isValid = login != null && password != null;
		if(!isValid) {
			return null;
		}
		return schoolDao.getByLoginAndPassword(login, password);
	}

}
