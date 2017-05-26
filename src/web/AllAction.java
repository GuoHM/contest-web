package web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.log4j.Logger;

import bean.LoginInfo;
import bean.Normaluser;
import service.IAlluserService;
import service.INormaluserService;


public class AllAction extends ActionSupport implements ServletRequestAware {

	private IAlluserService allService;
	private INormaluserService normaluserService;
	protected HttpServletRequest servletRequest = null;
	Logger logger=Logger.getLogger(AllAction.class);
	private String loginuser;
	private String password;
	private int type;
	LoginInfo login;
	Normaluser user;	
	ActionContext context = ActionContext.getContext();

	/**
	 * @return the allService
	 */
	public IAlluserService getAllService() {
		return allService;
	}

	/**
	 * @param allService the allService to set
	 */
	public void setAllService(IAlluserService allService) {
		this.allService = allService;
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
	 * @return the login
	 */
	public LoginInfo getLogin() {
		return login;
	}

	/**
	 * @param login the login to set
	 */
	public void setLogin(LoginInfo login) {
		this.login = login;
	}

	/**
	 * @return the user
	 */
	public Normaluser getUser() {
		return user;
	}

	/**
	 * @param user the user to set
	 */
	public void setUser(Normaluser user) {
		this.user = user;
	}

	public String login() throws Exception {
		LoginInfo login = null;
		System.out.println(allService);
		try {
			login = allService.getUserByLoginAndPassword(loginuser, password);
		} catch (Exception e) {
			logger.error(e);
		}
		if(login == null) {
			addError("”√ªß√˚ªÚ√‹¬Î¥ÌŒÛ");
			return INPUT;
		}
		context.getSession().put("user", login);
		setLogin(login);
		return null;
	}
	
	public String input() {
		return INPUT;
	}
	
	public String regist() throws Exception {
		Normaluser user = new Normaluser();
		user.setUserId(loginuser);
		user.setPassword(password);
		LoginInfo login = new LoginInfo();
		login.getId().setUserId(loginuser);
		login.getId().setPassword(password);
		try {
			allService.addUser(user);
		} catch (RuntimeException e) {
			logger.error(e);
			servletRequest.setAttribute("fail", "◊¢≤· ß∞‹");
			return INPUT;
		}
		setLogin(login);
		return SUCCESS;
	}
	
	public String checkUser() throws Exception {
		String cusName = servletRequest.getParameter("cusName");
		boolean isNameValid = allService.isLoginValid(cusName);
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

}
