package web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;

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

	private INormaluserService normaluserService;
	private ISchooluserService schooluserService;
	private IAdminuserService adminuserService;
	protected HttpServletRequest servletRequest = null;
	Logger logger = Logger.getLogger(AllAction.class);
	private String loginuser;
	private String password;
	private int type;
	Schooluser school;
	Adminuser admin;
	Normaluser normal;
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
					addError("用户名或密码错误");
					return INPUT;
				} else {
					context.getSession().put("normaluser", normal);
					System.out.println(context.getSession().get("normaluser"));
					setNormal(normal);
					return "normal";
				}
			}
			/**
			 * schooluser login
			 */
			case 2: {
				Schooluser school = schooluserService.getUserByLoginAndPassword(loginuser, password);
				if (school == null) {
					addError("用户名或密码错误");
					return INPUT;
				} else {
					context.getSession().put("schooluser", school);
					setSchool(school);
					return "school";
				}
			}
			/**
			 * adminuser login
			 */
			case 3: {
				Adminuser admin = adminuserService.getUserByLoginAndPassword(loginuser, password);
				if (admin == null) {
					addError("用户名或密码错误");
					return INPUT;
				} else {
					context.getSession().put("adminuser", admin);
					setAdmin(admin);
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

	public String regist() throws Exception {
		Normaluser user = new Normaluser();
		user.setUserId(loginuser);
		user.setPassword(password);
		try {
			normaluserService.addUser(user);
			context.getSession().put("normal", user);
		} catch (RuntimeException e) {
			logger.error(e);
			servletRequest.setAttribute("fail", "注册失败");
			return INPUT;
		}
		setNormal(user);
		return "normal";
	}

	public String checkUser() throws Exception {
		String cusName = servletRequest.getParameter("cusName");
		boolean isNameValid = normaluserService.isLoginValid(cusName);
		HttpServletResponse response = ServletActionContext.getResponse();
		response.setHeader("Cache-Control", "no-store");
		response.setHeader("Pragma", "no-cache");
		response.setDateHeader("Expires", 0);
		response.setContentType("text/html");
		response.getWriter().write("{\"isNameValid\":" + isNameValid + "}");
		return null;
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
	 * @return the school
	 */
	public Schooluser getSchool() {
		return school;
	}

	/**
	 * @param school the school to set
	 */
	public void setSchool(Schooluser school) {
		this.school = school;
	}

	/**
	 * @return the admin
	 */
	public Adminuser getAdmin() {
		return admin;
	}

	/**
	 * @param admin the admin to set
	 */
	public void setAdmin(Adminuser admin) {
		this.admin = admin;
	}

	/**
	 * @return the normal
	 */
	public Normaluser getNormal() {
		return normal;
	}

	/**
	 * @param normal the normal to set
	 */
	public void setNormal(Normaluser normal) {
		this.normal = normal;
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
