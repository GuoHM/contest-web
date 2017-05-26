package web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;

import com.opensymphony.xwork2.ActionSupport;

import bean.LoginInfo;
import bean.Normaluser;
import service.IAlluserService;
import service.INormaluserService;


public class AllAction extends ActionSupport implements ServletRequestAware {

	private IAlluserService allService;
	private INormaluserService normaluserService;
	protected HttpServletRequest servletRequest = null;
	private String loginuser;
	private String password;
	LoginInfo login;
	Normaluser user;

	/**
	 * @return the allservice
	 */
	public IAlluserService getAllservice() {
		return allService;
	}

	/**
	 * @param allservice the allservice to set
	 */
	public void setAllservice(IAlluserService allservice) {
		this.allService = allservice;
	}

	/**
	 * @return the userservice
	 */
	public INormaluserService getUserservice() {
		return normaluserService;
	}

	/**
	 * @param userservice the userservice to set
	 */
	public void setUserservice(INormaluserService userservice) {
		this.normaluserService = userservice;
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

	public String login() throws Exception {
		LoginInfo login = null;
		try {
			login = allService.getUserByLoginAndPassword(loginuser, password);
		} catch (Exception e) {
			System.out.println(e);
		}
		if(login == null) {
			addError("”√ªß√˚ªÚ√‹¬Î¥ÌŒÛ");
			return INPUT;
		}
		setLogin(login);
		return SUCCESS;
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
			System.out.println(e);
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
