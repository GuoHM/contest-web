package dao;

import bean.Adminuser;

public interface IAdminuserDao {
	
	Adminuser getAdminuserByUserid() throws Exception;

}
