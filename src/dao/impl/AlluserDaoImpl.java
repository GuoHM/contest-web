package dao.impl;

import org.hibernate.Session;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import bean.LoginInfo;
import bean.Normaluser;
import dao.IAlluserDao;

public class AlluserDaoImpl extends HibernateDaoSupport implements IAlluserDao {

	@Override
	public LoginInfo getByLoginAndPassword(String login, String password) throws Exception {
		// TODO Auto-generated method stub
		String hql = "from LoginInfo where userId=? and password=?";
		Session session = null;
		LoginInfo user = null;
		try {
			session = getSession();
			user = (LoginInfo) session.createQuery(hql).setParameter(0, login).setParameter(1, password)
					.uniqueResult();
		} finally {
			releaseSession(session);
		}
		return user;
	}

}
