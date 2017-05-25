package dao.impl;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import bean.Team;
import dao.ITeamDao;

public class TeamDaoImpl extends HibernateDaoSupport implements ITeamDao {

	@Override
	public void save(Team team) throws Exception {
		// TODO Auto-generated method stub
		getHibernateTemplate().save(team);
	}

}
