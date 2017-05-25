package dao.impl;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import bean.WorksInfo;
import dao.IWorksInfoDao;

public class WorksInfoDaoImpl extends HibernateDaoSupport implements IWorksInfoDao {

	@Override
	public void save(WorksInfo works) throws Exception {
		// TODO Auto-generated method stub
		getHibernateTemplate().save(works);
	}

}
