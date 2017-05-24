package bean;
// Generated 2017-5-24 16:53:17 by Hibernate Tools 3.5.0.Final

import java.util.HashSet;
import java.util.Set;

/**
 * WorksInfo generated by hbm2java
 */
public class WorksInfo implements java.io.Serializable {

	private Integer worksId;
	private AdminInfo adminInfo;
	private Schooluser schooluser;
	private String description;
	private String types;
	private String worksName;
	private Set teams = new HashSet(0);

	public WorksInfo() {
	}

	public WorksInfo(AdminInfo adminInfo, Schooluser schooluser, String description, String types, String worksName) {
		this.adminInfo = adminInfo;
		this.schooluser = schooluser;
		this.description = description;
		this.types = types;
		this.worksName = worksName;
	}

	public WorksInfo(AdminInfo adminInfo, Schooluser schooluser, String description, String types, String worksName,
			Set teams) {
		this.adminInfo = adminInfo;
		this.schooluser = schooluser;
		this.description = description;
		this.types = types;
		this.worksName = worksName;
		this.teams = teams;
	}

	public Integer getWorksId() {
		return this.worksId;
	}

	public void setWorksId(Integer worksId) {
		this.worksId = worksId;
	}

	public AdminInfo getAdminInfo() {
		return this.adminInfo;
	}

	public void setAdminInfo(AdminInfo adminInfo) {
		this.adminInfo = adminInfo;
	}

	public Schooluser getSchooluser() {
		return this.schooluser;
	}

	public void setSchooluser(Schooluser schooluser) {
		this.schooluser = schooluser;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getTypes() {
		return this.types;
	}

	public void setTypes(String types) {
		this.types = types;
	}

	public String getWorksName() {
		return this.worksName;
	}

	public void setWorksName(String worksName) {
		this.worksName = worksName;
	}

	public Set getTeams() {
		return this.teams;
	}

	public void setTeams(Set teams) {
		this.teams = teams;
	}

}