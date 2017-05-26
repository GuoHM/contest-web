package service.impl;

import bean.Normaluser;
import bean.Schooluser;
import bean.Team;
import bean.Teaminfo;
import bean.WorksInfo;
import dao.INormaluserDao;
import dao.ISchooluserDao;
import dao.ITeamDao;
import dao.IWorksInfoDao;
import dao.impl.SchooluserDaoImpl;
import dao.impl.TeamDaoImpl;
import dao.impl.WorksInfoDaoImpl;
import service.INormaluserService;

public class NormaluserServiceImpl implements INormaluserService {
	private INormaluserDao normaluserDao;
	private ISchooluserDao schoolDao;
	private ITeamDao teamDao;
	private IWorksInfoDao worksDao;

	/**
	 * @Method fillInfo
	 * @Description update the user information
	 * @param userid
	 *            the login id
	 * @param user
	 *            an user object,transfer to another object which the userid
	 *            equals the param userid.
	 * @throws Exception
	 * @see service.INormaluserService#fillInfo(java.lang.String, bean.Normaluser)
	 */
	@Override
	public void fillInfo(String userid, Normaluser user) throws Exception {
		// TODO Auto-generated method stub
		Normaluser input = normaluserDao.getNormaluserByUser(userid);
		input.setCollege(user.getCollege());
		input.setEmail(user.getCollege());
		input.setGrade(user.getGrade());
		input.setId(user.getId());
		input.setMajor(user.getMajor());
		input.setName(user.getName());
		input.setPhone(user.getPhone());
		input.setSex(user.getSex());
		input.setSno(user.getSno());
		input.setId(user.getId());
		normaluserDao.save(input);
	}

	/**
	 * @Method: enroll
	 * @Description: finish the contest enrollment function,insert the data into 3 different tables.
	 * @param team
	 *            the view which is from the input user
	 * @throws Exception
	 * @see service.INormaluserService#enroll(bean.Teaminfo)
	 */
	@Override
	public void enroll(Teaminfo team) throws Exception {
		// TODO Auto-generated method stub
		String[] id = new String[3];
		id[0] = team.getId().getId1();
		id[1] = team.getId().getId2();
		id[2] = team.getId().getId3();
		/** change table Normaluser,set each students with a team_no */
		for (int i = 0; i < id.length; i++) {
			Normaluser user = null;
			user = normaluserDao.getNormaluserById(id[i]);
			user.setTeamNo(team.getId().getTeamNo());
			normaluserDao.save(user);
		}
		/**
		 * change table WorksInfo,set description,shooluser,types and worksname
		 */
		WorksInfo works = null;
		works.setDescription(team.getId().getDescription());
		Schooluser school = schoolDao.getSchooluserById(team.getId().getSchool());
		works.setSchooluser(school);
		works.setTypes(team.getId().getTypes());
		works.setWorksName(team.getId().getWorksName());
		worksDao.save(works);
		/**
		 * change table Team,set team name,teacher,teacher_phone
		 */
		Team t = null;
		t.setTeacher(team.getId().getTeacher());
		t.setTeacherPhone(team.getId().getTeacherPhone());
		t.setTeamName(team.getId().getTeamName());
		teamDao.save(t);
	}

	@Override
	public void modifyPassword(String user, String password) throws Exception {
		// TODO Auto-generated method stub
		Normaluser input = normaluserDao.getNormaluserByUser(user);
		input.setPassword(password);
		normaluserDao.save(input);
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
	 * @return the schooldao
	 */
	public ISchooluserDao getSchooldao() {
		return schoolDao;
	}

	/**
	 * @param schooldao the schooldao to set
	 */
	public void setSchooldao(ISchooluserDao schooldao) {
		this.schoolDao = schooldao;
	}

	/**
	 * @return the teamdao
	 */
	public ITeamDao getTeamdao() {
		return teamDao;
	}

	/**
	 * @param teamdao the teamdao to set
	 */
	public void setTeamdao(ITeamDao teamdao) {
		this.teamDao = teamdao;
	}

	/**
	 * @return the worksdao
	 */
	public IWorksInfoDao getWorksdao() {
		return worksDao;
	}

	/**
	 * @param worksdao the worksdao to set
	 */
	public void setWorksdao(IWorksInfoDao worksdao) {
		this.worksDao = worksdao;
	}

	
}
