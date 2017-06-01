import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bean.Normaluser;
import dao.INormaluserDao;
import dao.ISchooluserDao;
import dao.ITeamDao;
import dao.IWorksDao;
import service.ISchooluserService;
import web.AllAction;

public class test {

	public static AllAction loginAction;
	public static INormaluserDao normaluserDao;
	public static ISchooluserDao schoolDao;
	public static ITeamDao teamDao;
	public static IWorksDao worksDao;
	public static ISchooluserService schooluserService;

	/**
	 * @return the schooluserService
	 */
	public static ISchooluserService getSchooluserService() {
		return schooluserService;
	}

	/**
	 * @param schooluserService the schooluserService to set
	 */
	public static void setSchooluserService(ISchooluserService schooluserService) {
		test.schooluserService = schooluserService;
	}

	/**
	 * @return the loginAction
	 */
	public static AllAction getLoginAction() {
		return loginAction;
	}

	/**
	 * @param loginAction the loginAction to set
	 */
	public static void setLoginAction(AllAction loginAction) {
		test.loginAction = loginAction;
	}

	/**
	 * @return the normaluserDao
	 */
	public static INormaluserDao getNormaluserDao() {
		return normaluserDao;
	}

	/**
	 * @param normaluserDao the normaluserDao to set
	 */
	public static void setNormaluserDao(INormaluserDao normaluserDao) {
		test.normaluserDao = normaluserDao;
	}

	/**
	 * @return the schoolDao
	 */
	public static ISchooluserDao getSchoolDao() {
		return schoolDao;
	}

	/**
	 * @param schoolDao the schoolDao to set
	 */
	public static void setSchoolDao(ISchooluserDao schoolDao) {
		test.schoolDao = schoolDao;
	}

	/**
	 * @return the teamDao
	 */
	public static ITeamDao getTeamDao() {
		return teamDao;
	}

	/**
	 * @param teamDao the teamDao to set
	 */
	public static void setTeamDao(ITeamDao teamDao) {
		test.teamDao = teamDao;
	}

	/**
	 * @return the worksDao
	 */
	public static IWorksDao getWorksDao() {
		return worksDao;
	}

	/**
	 * @param worksDao the worksDao to set
	 */
	public static void setWorksDao(IWorksDao worksDao) {
		test.worksDao = worksDao;
	}

	public static void main(String[] args) throws Exception {
		//1.����spring��IOC��������Application������޲ι���������ʼ�����ҵ���set��������ֵ��
		//ClassPathXmlApplicationContext��Application�Ľӿڵ�ʵ�֡�����·���¶�ȡ�����ļ���
		ApplicationContext acx = new ClassPathXmlApplicationContext("classpath*:config/applicationContext-*.xml");
		//2.��IOC�����л�ȡbean��
		//����Id��λ��IOC�����е�Bean
		INormaluserDao normaluserDao = (INormaluserDao) acx.getBean("normaluserDao");
		ISchooluserDao schoolDao = (ISchooluserDao) acx.getBean("schoolDao");
		ITeamDao teamDao = (ITeamDao) acx.getBean("teamDao");
	    ISchooluserService schooluserService = (ISchooluserService) acx.getBean("schooluserService");
		//HelloWorld helloworld = acx.getBean(HelloWorld.class);
		//�������ͷ���IOC�����е�bean����Ҫ������IOC������ֻ��һ�������͵�bean��
		//3.���÷�����
		System.out.println(normaluserDao);
		System.out.println(schoolDao);
		System.out.println(teamDao);
		System.out.println(schooluserService);
		List<Normaluser> list = schooluserService.getUsersBySchool("10001");
		System.out.println(list);
		System.out.println(list.size());
	}

}
