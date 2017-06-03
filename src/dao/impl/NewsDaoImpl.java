package dao.impl;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import bean.News;
import dao.INewsDao;

public class NewsDaoImpl extends HibernateDaoSupport implements INewsDao {

	@Override
	public void save(News news) throws Exception {
		// TODO Auto-generated method stub
		getHibernateTemplate().saveOrUpdate(news);
	}

}
