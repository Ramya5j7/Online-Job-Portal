package jobportal.Bean;

public class jobs {
	private String jobtitle;
	  private String jobdescription;
	  private String salary;
	  private String skills;
	  private String joblocation;
	  private String contactperson;
	  private String contactpersonnumber;
	  private String companyname;
	  private String companyemail;
	public String getJobtitle() {
		return jobtitle;
	}
	public void setJobtitle(String jobtitle) {
		this.jobtitle = jobtitle;
	}
	public String getJobdescription() {
		return jobdescription;
	}
	public void setJobdescription(String jobdescription) {
		this.jobdescription = jobdescription;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public String getSkills() {
		return skills;
	}
	public void setSkills(String skills) {
		this.skills = skills;
	}
	public String getJoblocation() {
		return joblocation;
	}
	public void setJoblocation(String joblocation) {
		this.joblocation = joblocation;
	}
	public String getContactperson() {
		return contactperson;
	}
	public void setContactperson(String contactperson) {
		this.contactperson = contactperson;
	}
	public String getContactpersonnumber() {
		return contactpersonnumber;
	}
	public void setContactpersonnumber(String contactpersonnumber) {
		this.contactpersonnumber = contactpersonnumber;
	}
	public String getCompanyname() {
		return companyname;
	}
	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}
	public String getCompanyemail() {
		return companyemail;
	}
	public void setCompanyemail(String companyemail) {
		this.companyemail = companyemail;
	}
	@Override
	public String toString() {
		return "jobs [jobtitle=" + jobtitle + ", jobdescription=" + jobdescription + ", salary=" + salary + ", skills="
				+ skills + ", joblocation=" + joblocation + ", contactperson=" + contactperson
				+ ", contactpersonnumber=" + contactpersonnumber + ", companyname=" + companyname + ", companyemail="
				+ companyemail + "]";
	}
	public jobs() {
		
		// TODO Auto-generated constructor stub
	}
	  
}
