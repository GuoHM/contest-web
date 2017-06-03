package dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import bean.Adminuser;
import bean.Teaminfo;
import dao.ITeaminfoDao;

public class TeaminfoDaoImpl extends HibernateDaoSupport implements ITeaminfoDao {

	@Override
	public List<Teaminfo> getTeamsBySchool(String school) throws Exception {
		// TODO Auto-generated method stub
		String hql;
		hql = "from Teaminfo t where t.id.school=?";
		Session session = null;
		List<Teaminfo> list = null;
		try {
			session = getSession();
			list =  (List<Teaminfo>) session.createQuery(hql).setParameter(0, school).list();
		} finally {
			releaseSession(session);
		}
		return list;
	}
	
	@Override
	public List<Teaminfo> getAllTeams() throws Exception {
		// TODO Auto-generated method stub
		String hql;
		hql = "from Teaminfo";
		Session session = null;
		List<Teaminfo> list = null;
		try {
			session = getSession();
			list =  (List<Teaminfo>)session.createQuery(hql).list();
		} finally {
			releaseSession(session);
		}
		return list;
	}
	
	

}
