package dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;


import bean.School;
import dao.ISchoolDao;

public class SchoolDaoImpl extends HibernateDaoSupport implements ISchoolDao {

	@Override
	public List<School> getAll() throws Exception {
		// TODO Auto-generated method stub
		List<School> schoollist=null;
		Session session = null;
		String hql = "select new list(s.universityNO,s.universityName,s.univeristyType) from School s";
		try {
			session = getSession();
			schoollist = session.createQuery(hql).list();
		} finally {
			releaseSession(session);
		}
		System.out.println(schoollist);
		return schoollist;
	}
}
