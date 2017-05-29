package web;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.interceptor.ServletRequestAware;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.log4j.Logger;

import bean.Adminuser;
import bean.Normaluser;
import bean.Schooluser;
import service.IAdminuserService;
import service.INormaluserService;
import service.ISchooluserService;

public class AllAction extends ActionSupport implements ServletRequestAware {

	/** 
	 * @Fields serialVersionUID : TODO
	 */
	private static final long serialVersionUID = 264830797784385859L;
	private INormaluserService normaluserService;
	private ISchooluserService schooluserService;
	private IAdminuserService adminuserService;
	protected HttpServletRequest servletRequest = null;
	Logger logger = Logger.getLogger(AllAction.class);
	private String loginuser;
	private String password;
	private int type;
	ActionContext context = ActionContext.getContext();

	public String login() throws Exception {
		//LoginInfo login = null;
		try {
			switch (type) {
			/**
			 * normaluser login
			 */
			case 1: {
				Normaluser normal = normaluserService.getUserByLoginAndPassword(loginuser, password);
				if (normal == null) {
					addActionError("用户名或密码错误");
					return INPUT;
				} else {
					context.getSession().put("login", normal);
					context.getSession().put("type", "1");
					return "normal";
				}
			}
			/**
			 * schooluser login
			 */
			case 2: {
				Schooluser school = schooluserService.getUserByLoginAndPassword(loginuser, password);
				if (school == null) {
					addActionError("用户名或密码错误");
					return INPUT;
				} else {
					context.getSession().put("login", school);
					context.getSession().put("type", "2");
					return "school";
				}
			}
			/**
			 * adminuser login
			 */
			case 3: {
				Adminuser admin = adminuserService.getUserByLoginAndPassword(loginuser, password);
				if (admin == null) {
					addActionError("用户名或密码错误");
					return INPUT;
				} else {
					context.getSession().put("login", admin);
					context.getSession().put("type", "3");
					return "admin";
				}
			}
			default:
				return INPUT;
			}
		} catch (Exception e) {
			logger.error(e);
		}
		return INPUT;
	}

	public String input() {
		return INPUT;
	}

	public String logout() {
		context.getSession().remove("login");
		context.getSession().remove("type");
		return SUCCESS;
	}

	public String regist() throws Exception {
		Normaluser user = new Normaluser();
		user.setUserId(loginuser);
		user.setPassword(password);
		boolean isNameValid = normaluserService.isLoginValid(loginuser);
		if( isNameValid) {
			try {
				normaluserService.addUser(user);
				context.getSession().put("login", user);
				context.getSession().put("type", "1");
			} catch (RuntimeException e) {
				addActionError("注册失败");
				return INPUT;
			}
			return "normal";
		} else {
			addActionError("该用户名已经注册");
			return INPUT;
		}
	}

	public void addError(String errorKey) {
		addActionError(getText(errorKey));
	}

	/**
	 * @return the normaluserService
	 */
	public INormaluserService getNormaluserService() {
		return normaluserService;
	}

	/**
	 * @param normaluserService the normaluserService to set
	 */
	public void setNormaluserService(INormaluserService normaluserService) {
		this.normaluserService = normaluserService;
	}

	/**
	 * @return the schooluserService
	 */
	public ISchooluserService getSchooluserService() {
		return schooluserService;
	}

	/**
	 * @param schooluserService the schooluserService to set
	 */
	public void setSchooluserService(ISchooluserService schooluserService) {
		this.schooluserService = schooluserService;
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
	 * @return the loginuser
	 */
	public String getLoginuser() {
		return loginuser;
	}

	/**
	 * @param loginuser the loginuser to set
	 */
	public void setLoginuser(String loginuser) {
		this.loginuser = loginuser;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the type
	 */
	public int getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(int type) {
		this.type = type;
	}

	/**
	 * @return the context
	 */
	public ActionContext getContext() {
		return context;
	}

	/**
	 * @param context the context to set
	 */
	public void setContext(ActionContext context) {
		this.context = context;
	}

}
