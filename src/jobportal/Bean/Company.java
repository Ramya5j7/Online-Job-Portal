package jobportal.Bean;

public class Company {
	private String canme;
	  private String email;
	  private String usernmae;
	  private String password;
	  private String website;
	  private String contactperson;
	  private String contactpersonnumber;
	public String getCanme() {
		return canme;
	}
	public void setCanme(String canme) {
		this.canme = canme;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
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
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
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
	@Override
	public String toString() {
		return "Company [canme=" + canme + ", email=" + email + ", usernmae=" + usernmae + ", password=" + password
				+ ", website=" + website + ", contactperson=" + contactperson + ", contactpersonnumber="
				+ contactpersonnumber + "]";
	}
	public Company(String canme, String email, String usernmae, String password, String website, String contactperson,
			String contactpersonnumber) {
		super();
		this.canme = canme;
		this.email = email;
		this.usernmae = usernmae;
		this.password = password;
		this.website = website;
		this.contactperson = contactperson;
		this.contactpersonnumber = contactpersonnumber;
	}
	public Company() {
		
		// TODO Auto-generated constructor stub
	}
	
	  
}
