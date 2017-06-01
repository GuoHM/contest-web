package service.impl;

import java.util.List;

import bean.Normaluser;
import bean.Schooluser;
import dao.INormaluserDao;
import dao.ISchooluserDao;
import service.ISchooluserService;

public class SchooluserServiceImpl implements ISchooluserService {
	private ISchooluserDao schooluserDao;
	private INormaluserDao normaluserDao;

	@Override
	public Schooluser getUserByLoginAndPassword(String login, String password) throws Exception {
		// TODO Auto-generated method stub
		boolean isValid = login != null && password != null;
		if(!isValid) {
			return null;
		}
		return schooluserDao.getByLoginAndPassword(login, password);
	}

	@Override
	public void save(Schooluser user) throws Exception {
		// TODO Auto-generated method stub
		if(user != null) {
			schooluserDao.save(user);
		}
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

	/**
	 * @return the schoolDao
	 */
	public ISchooluserDao getSchoolDao() {
		return schooluserDao;
	}

	/**
	 * @param schoolDao the schoolDao to set
	 */
	public void setSchooluserDao(ISchooluserDao schoolDao) {
		this.schooluserDao = schoolDao;
	}

	@Override
	public List<Normaluser> getUsersBySchool(String school) throws Exception {
		// TODO Auto-generated method stub
		if(school != null && !school.equals("")) {
			return normaluserDao.getNormalusersBySchool(school);
		} else {
			return null;
		}
	}

}
