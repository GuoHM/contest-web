import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import dao.INormaluserDao;
import dao.ISchooluserDao;
import dao.ITeamDao;
import dao.IWorksDao;
import web.AllAction;

public class test {

	public static AllAction loginAction;
	public static INormaluserDao normaluserDao;
	public static ISchooluserDao schoolDao;
	public static ITeamDao teamDao;
	public static IWorksDao worksDao;

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

	public static void main(String[] args) {
		//1.创建spring的IOC容器对象，Application会调用无参构造器来初始化并且调用set方法来赋值。
		//ClassPathXmlApplicationContext是Application的接口的实现。从类路径下读取配置文件。
//		ApplicationContext acx = new ClassPathXmlApplicationContext("classpath*:config/applicationContext-*.xml");
//		//2.从IOC容器中获取bean。
//		//利用Id定位到IOC容器中的Bean
//		AllAction helloworld = (AllAction) acx.getBean("loginAction");
//		INormaluserDao normaluserDao = (INormaluserDao) acx.getBean("normaluserDao");
//		ISchooluserDao schoolDao = (ISchooluserDao) acx.getBean("schoolDao");
//		ITeamDao teamDao = (ITeamDao) acx.getBean("teamDao");
//		IWorksInfoDao worksDao = (IWorksInfoDao) acx.getBean("worksDao");
//		AllAction helloworld = (AllAction) acx.getBean("loginAction");
		//HelloWorld helloworld = acx.getBean(HelloWorld.class);
		//利用类型返回IOC容器中的bean，但要求是在IOC容器中只有一个该类型的bean。
		//3.调用方法。
		System.out.println(loginAction);
		System.out.println(normaluserDao);
		System.out.println(schoolDao);
		System.out.println(teamDao);
		System.out.println(worksDao);
		System.out.println(loginAction);
	}

}
