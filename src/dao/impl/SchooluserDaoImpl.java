package dao.impl;

import org.hibernate.Session;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import bean.Adminuser;
import bean.Normaluser;
import bean.Schooluser;
import dao.ISchooluserDao;

public class SchooluserDaoImpl extends HibernateDaoSupport implements ISchooluserDao {

	@Override
	public Schooluser getSchooluserByUserid(String id) throws Exception {
		// TODO Auto-generated method stub
		String hql;
		hql = "from Schooluser where schooluserid=?";
		Session session = null;
		Schooluser user = null;
		try {
			session = getSession();
			user = (Schooluser) session.createQuery(hql).setParameter(0, id).uniqueResult();
		} finally {
			releaseSession(session);
		}
		return user;
	}

	@Override
	public Schooluser getByLoginAndPassword(String login, String password) throws Exception {
		// TODO Auto-generated method stub
		String hql = "from Schooluser where schooluserId=? and password=?";
		Session session = null;
		Schooluser user = null;
		try {
			session = getSession();
			user = (Schooluser) session.createQuery(hql).setParameter(0, login).setParameter(1, password)
					.uniqueResult();
		} finally {
			releaseSession(session);
		}
		return user;
	}

}
