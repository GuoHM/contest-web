package dao.impl;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import bean.Works;
import dao.IWorksDao;

public class WorksDaoImpl extends HibernateDaoSupport implements IWorksDao {

	@Override
	public void save(Works works) throws Exception {
		// TODO Auto-generated method stub
		getHibernateTemplate().save(works);
	}

}
