package jobportal.Bean;

public class TotalAppliedCandidates {
	private String companyName;
	private String jobtitle;
	private String email;
	private String fullName;
	private String mobileNo;
	private String skills;
	private String Applied;
	private String Approved;
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getJobtitle() {
		return jobtitle;
	}
	public void setJobtitle(String jobtitle) {
		this.jobtitle = jobtitle;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getSkills() {
		return skills;
	}
	public void setSkills(String skills) {
		this.skills = skills;
	}
	public String getApplied() {
		return Applied;
	}
	public void setApplied(String applied) {
		Applied = applied;
	}
	public String getApproved() {
		return Approved;
	}
	public void setApproved(String approved) {
		Approved = approved;
	}
	@Override
	public String toString() {
		return "TotalAppliedCandidates [companyName=" + companyName + ", jobtitle=" + jobtitle + ", email=" + email
				+ ", fullName=" + fullName + ", mobileNo=" + mobileNo + ", skills=" + skills + ", Applied=" + Applied
				+ ", Approved=" + Approved + "]";
	}
	public TotalAppliedCandidates(String companyName, String jobtitle, String email, String fullName, String mobileNo,
			String skills, String applied, String approved) {
		super();
		this.companyName = companyName;
		this.jobtitle = jobtitle;
		this.email = email;
		this.fullName = fullName;
		this.mobileNo = mobileNo;
		this.skills = skills;
		Applied = applied;
		Approved = approved;
	}
   public TotalAppliedCandidates() {
		
		
	}
	
}
