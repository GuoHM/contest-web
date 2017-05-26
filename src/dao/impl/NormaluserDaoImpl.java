package dao.impl;

import org.hibernate.Session;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import bean.Normaluser;
import bean.Schooluser;
import bean.Team;
import bean.Teaminfo;
import bean.WorksInfo;
import dao.INormaluserDao;

public class NormaluserDaoImpl extends HibernateDaoSupport implements INormaluserDao {

	@Override
	public void save(Normaluser user) throws Exception {
		// TODO Auto-generated method stub
		getHibernateTemplate().save(user);

	}

	@Override
	public Normaluser getNormaluserById(String id) {
		String hql = "from Normaluser where id=?";
		Session session = null;
		Normaluser user = null;
		try {
			session = getSession();
			user = (Normaluser) session.createQuery(hql).setParameter(0, id).uniqueResult();
		} finally {
			releaseSession(session);
		}
		return user;
	}

	@Override
	public Normaluser getNormaluserByUser(String userId) throws Exception {
		// TODO Auto-generated method stub
		String hql = "from Normaluser where userId=?";
		Session session = null;
		Normaluser user = null;
		try {
			session = getSession();
			user = (Normaluser) session.createQuery(hql).setParameter(0, userId).uniqueResult();
		} finally {
			releaseSession(session);
		}
		return user;
	}

}
