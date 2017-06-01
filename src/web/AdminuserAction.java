package web;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.apache.struts2.interceptor.ServletRequestAware;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import bean.Normaluser;
import dao.INormaluserDao;
import dao.ISchoolDao;
import service.IAdminuserService;

public class AdminuserAction extends ActionSupport implements ServletRequestAware  {
	
	/** 
	* @Fields serialVersionUID : TODO
	*/
	private static final long serialVersionUID = 961947653152880821L;
	protected HttpServletRequest servletRequest = null;
	Logger logger = Logger.getLogger(AllAction.class);
	private IAdminuserService adminuserService;
	private INormaluserDao normaluserDao;
	private ISchoolDao schoolDao;
	private String school;
	ActionContext context = ActionContext.getContext();
	
	public String listNormaluser() throws Exception {
		if(school.equals("0")) {
			List<Normaluser> list = normaluserDao.getAllUsers();
			String schoolname = "所有学校";
			context.getSession().put("userlist", list);
			context.getSession().put("schoolname", schoolname);
			return SUCCESS;
		}
		List<Normaluser> list = normaluserDao.getNormalusersBySchool(school);
		String schoolname = schoolDao.getSchoolNameByNo(school);
		context.getSession().put("userlist", list);
		context.getSession().put("schoolname", schoolname);
		return SUCCESS;
	}
	/**
	 * @return the servletRequest
	 */
	public HttpServletRequest getServletRequest() {
		return servletRequest;
	}
	/**
	 * @param servletRequest the servletRequest to set
	 */
	public void setServletRequest(HttpServletRequest servletRequest) {
		this.servletRequest = servletRequest;
	}
	/**
	 * @return the logger
	 */
	public Logger getLogger() {
		return logger;
	}
	/**
	 * @param logger the logger to set
	 */
	public void setLogger(Logger logger) {
		this.logger = logger;
	}
	/**
	 * @return the adminuserService
	 */
	public IAdminuserService getAdminuserService() {
		return adminuserService;
	}
	/**
	 * @param adminuserService the adminuserService to set
	 */
	public void setAdminuserService(IAdminuserService adminuserService) {
		this.adminuserService = adminuserService;
	}
	/**
	 * @return the school
	 */
	public String getSchool() {
		return school;
	}
	/**
	 * @param school the school to set
	 */
	public void setSchool(String school) {
		this.school = school;
	}
	/**
	 * @return the normaluserDao
	 */
	public INormaluserDao getNormaluserDao() {
		return normaluserDao;
	}
	/**
	 * @param normaluserDao the normaluserDao to set
	 */
	public void setNormaluserDao(INormaluserDao normaluserDao) {
		this.normaluserDao = normaluserDao;
	}
	/**
	 * @return the schoolDao
	 */
	public ISchoolDao getSchoolDao() {
		return schoolDao;
	}
	/**
	 * @param schoolDao the schoolDao to set
	 */
	public void setSchoolDao(ISchoolDao schoolDao) {
		this.schoolDao = schoolDao;
	}
	
}
