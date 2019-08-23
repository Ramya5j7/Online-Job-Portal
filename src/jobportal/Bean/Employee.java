package jobportal.Bean;

public class Employee {
  private String email;
  private String faname;
  private String laname;
  private String mobileno;
  private String usernmae;
  private String password;
  private String gender;
  private String technicalskills;
  private String currentrole;
  private String company;
  private String experience;
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getFaname() {
	return faname;
}
public void setFaname(String fname) {
	this.faname = fname;
}
public String getLaname() {
	return laname;
}
public void setLaname(String lname) {
	this.laname = lname;
}
public String getMobileno() {
	return mobileno;
}
public void setMobileno(String mobileno) {
	this.mobileno = mobileno;
}
public String getUsernmae() {
	return usernmae;
}
public void setUsernmae(String usernmae) {
	this.usernmae = usernmae;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getTechnicalskills() {
	return technicalskills;
}
public void setTechnicalskills(String technicalskills) {
	this.technicalskills = technicalskills;
}
public String getCurrentrole() {
	return currentrole;
}
public void setCurrentrole(String currentrole) {
	this.currentrole = currentrole;
}
public String getCompany() {
	return company;
}
public void setCompany(String company) {
	this.company = company;
}
public String getExperience() {
	return experience;
}
public void setExperience(String experience) {
	this.experience = experience;
}
@Override
public String toString() {
	return "Employee [email=" + email + ", faname=" + faname + ", laname=" + laname + ", mobileno=" + mobileno
			+ ", usernmae=" + usernmae + ", password=" + password + ", gender=" + gender + ", technicalskills="
			+ technicalskills + ", currentrole=" + currentrole + ", company=" + company + ", experience=" + experience
			+ "]";
}
public Employee(String email, String faname, String laname, String mobileno, String usernmae, String password,
		String gender, String technicalskills, String currentrole, String company, String experience) {
	super();
	this.email = email;
	this.faname = faname;
	this.laname = laname;
	this.mobileno = mobileno;
	this.usernmae = usernmae;
	this.password = password;
	this.gender = gender;
	this.technicalskills = technicalskills;
	this.currentrole = currentrole;
	this.company = company;
	this.experience = experience;
}
public Employee() {
	
	// TODO Auto-generated constructor stub
}

  
}
