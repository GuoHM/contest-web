package bean;
// Generated 2017-5-24 16:53:17 by Hibernate Tools 3.5.0.Final

/**
 * TeaminfoId generated by hbm2java
 */
public class TeaminfoId implements java.io.Serializable {

	private int teamNo;
	private String teamName;
	private String teacher;
	private String teacherPhone;
	private String worksName;
	private String types;
	private String description;
	private String id1;
	private String id2;
	private String id3;

	public TeaminfoId() {
	}

	public TeaminfoId(int teamNo, String teamName, String teacher, String teacherPhone, String worksName, String types,
			String description) {
		this.teamNo = teamNo;
		this.teamName = teamName;
		this.teacher = teacher;
		this.teacherPhone = teacherPhone;
		this.worksName = worksName;
		this.types = types;
		this.description = description;
	}

	public TeaminfoId(int teamNo, String teamName, String teacher, String teacherPhone, String worksName, String types,
			String description, String id1, String id2, String id3) {
		this.teamNo = teamNo;
		this.teamName = teamName;
		this.teacher = teacher;
		this.teacherPhone = teacherPhone;
		this.worksName = worksName;
		this.types = types;
		this.description = description;
		this.id1 = id1;
		this.id2 = id2;
		this.id3 = id3;
	}

	public int getTeamNo() {
		return this.teamNo;
	}

	public void setTeamNo(int teamNo) {
		this.teamNo = teamNo;
	}

	public String getTeamName() {
		return this.teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public String getTeacher() {
		return this.teacher;
	}

	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}

	public String getTeacherPhone() {
		return this.teacherPhone;
	}

	public void setTeacherPhone(String teacherPhone) {
		this.teacherPhone = teacherPhone;
	}

	public String getWorksName() {
		return this.worksName;
	}

	public void setWorksName(String worksName) {
		this.worksName = worksName;
	}

	public String getTypes() {
		return this.types;
	}

	public void setTypes(String types) {
		this.types = types;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getId1() {
		return this.id1;
	}

	public void setId1(String id1) {
		this.id1 = id1;
	}

	public String getId2() {
		return this.id2;
	}

	public void setId2(String id2) {
		this.id2 = id2;
	}

	public String getId3() {
		return this.id3;
	}

	public void setId3(String id3) {
		this.id3 = id3;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof TeaminfoId))
			return false;
		TeaminfoId castOther = (TeaminfoId) other;

		return (this.getTeamNo() == castOther.getTeamNo())
				&& ((this.getTeamName() == castOther.getTeamName()) || (this.getTeamName() != null
						&& castOther.getTeamName() != null && this.getTeamName().equals(castOther.getTeamName())))
				&& ((this.getTeacher() == castOther.getTeacher()) || (this.getTeacher() != null
						&& castOther.getTeacher() != null && this.getTeacher().equals(castOther.getTeacher())))
				&& ((this.getTeacherPhone() == castOther.getTeacherPhone())
						|| (this.getTeacherPhone() != null && castOther.getTeacherPhone() != null
								&& this.getTeacherPhone().equals(castOther.getTeacherPhone())))
				&& ((this.getWorksName() == castOther.getWorksName()) || (this.getWorksName() != null
						&& castOther.getWorksName() != null && this.getWorksName().equals(castOther.getWorksName())))
				&& ((this.getTypes() == castOther.getTypes()) || (this.getTypes() != null
						&& castOther.getTypes() != null && this.getTypes().equals(castOther.getTypes())))
				&& ((this.getDescription() == castOther.getDescription())
						|| (this.getDescription() != null && castOther.getDescription() != null
								&& this.getDescription().equals(castOther.getDescription())))
				&& ((this.getId1() == castOther.getId1()) || (this.getId1() != null && castOther.getId1() != null
						&& this.getId1().equals(castOther.getId1())))
				&& ((this.getId2() == castOther.getId2()) || (this.getId2() != null && castOther.getId2() != null
						&& this.getId2().equals(castOther.getId2())))
				&& ((this.getId3() == castOther.getId3()) || (this.getId3() != null && castOther.getId3() != null
						&& this.getId3().equals(castOther.getId3())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getTeamNo();
		result = 37 * result + (getTeamName() == null ? 0 : this.getTeamName().hashCode());
		result = 37 * result + (getTeacher() == null ? 0 : this.getTeacher().hashCode());
		result = 37 * result + (getTeacherPhone() == null ? 0 : this.getTeacherPhone().hashCode());
		result = 37 * result + (getWorksName() == null ? 0 : this.getWorksName().hashCode());
		result = 37 * result + (getTypes() == null ? 0 : this.getTypes().hashCode());
		result = 37 * result + (getDescription() == null ? 0 : this.getDescription().hashCode());
		result = 37 * result + (getId1() == null ? 0 : this.getId1().hashCode());
		result = 37 * result + (getId2() == null ? 0 : this.getId2().hashCode());
		result = 37 * result + (getId3() == null ? 0 : this.getId3().hashCode());
		return result;
	}

}
