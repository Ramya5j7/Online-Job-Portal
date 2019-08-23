package jobportal.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import jobportal.Bean.Company;
import jobportal.Bean.Employee;
import jobportal.Bean.TotalAppliedCandidates;
import jobportal.Bean.jobs;
import jobportalSqlConnect.DBConnector;


public class SqlOperation {

static Connection con=null;
public boolean validateUser(String username,String password) {

    con=DBConnector.dbConnector();
try {
    String query = "select * from employee where email=? and Password=?";
    PreparedStatement st = con.prepareStatement(query);
    st.setString(1,username);
    st.setString(2, password);
    ResultSet rs = st.executeQuery();
    if (rs.next()) 
{return true;}
} 
catch (Exception e){System.out.println(e);}
return false;
}
public int addUser(String email,String faname,String laname,String mobileno,String username,String password,String gender,String technicalskills,String currentrole,String company,String experience) {
	try {
		con=DBConnector.dbConnector();
		String query="insert into employee values(?,?,?,?,?,?,?,?,?,?,?)";
		PreparedStatement st = con.prepareStatement(query);
		st.setString(1,email);
		st.setString(2, faname);
		st.setString(3, laname);
		st.setString(4, mobileno);
		st.setString(5, username);
		st.setString(6, password);
		st.setString(7, gender);
		st.setString(8, technicalskills);
		st.setString(9, currentrole);
		st.setString(10, company);
		st.setString(11, experience);
	int flag=	st.executeUpdate();
		System.out.println("Registration successful");
		return flag;
		
	}catch (Exception e){System.out.println(e);}
	return 0;
}
	public boolean validatecompany(String email,String password) {

	    con=DBConnector.dbConnector();
	try {
	    String query = "select * from company where email=? and Password=?";
	    PreparedStatement st = con.prepareStatement(query);
	    st.setString(1,email);
	    st.setString(2, password);
	    ResultSet rs = st.executeQuery();
	    if (rs.next()) 
	{return true;}
	} 
	catch (Exception e){System.out.println(e);}
	return false;
	}
	public int addcompany(String canme,String email,String username,String password,String website,String contactperson,String contactpersonname) {
		try {
			con=DBConnector.dbConnector();
			String query="insert into company values(?,?,?,?,?,?,?)";
			PreparedStatement st = con.prepareStatement(query);
			st.setString(1,canme);
			st.setString(2, email);
			st.setString(3, username);
			st.setString(4, password);
			st.setString(5, website);
			st.setString(6, contactperson);
			st.setString(7, contactpersonname);
			
		int flag=	st.executeUpdate();
			System.out.println("Registration successful");
			return flag;
			
		}catch (Exception e){System.out.println(e);}
		return 0;
	}
	public int addJob(String jobtitle, String jobdescription, String salary, String skills, String joblocation,
			String contactperson, String contactpersonnumber, String companyname, String companyemail) {

			try {
			con=DBConnector.dbConnector();
			String query="insert into jobs values(?,?,?,?,?,?,?,?,?)";
			PreparedStatement st=con.prepareStatement(query);
			st.setString(1,jobtitle);
			st.setString(2,jobdescription);
			st.setString(3,salary);
			st.setString(4,skills);
			st.setString(5,joblocation);
			st.setString(6,contactperson);
			st.setString(7,contactpersonnumber);
			st.setString(8,companyname);
			st.setString(9,companyemail);



			  int flag= st.executeUpdate();
			  System.out.println(flag);
			System.out.println("job Successful");
			return flag;
			} 
			catch (Exception e){System.out.println(e);
			}

			return 0;
			}
	public static List<jobs> list() throws SQLException {
		
		List<jobs> jobs = new ArrayList<jobs>();
		try {
			con=DBConnector.dbConnector();
		Statement statement = con.createStatement();
		ResultSet resultSet = statement.executeQuery("select * from jobs");

		while (resultSet.next()) {
		jobs j = new jobs();
		// Example :: j.setLocation(resultSet.getString("Location"));
		j.setJobtitle(resultSet.getString("jobtitle"));
	    j.setJobdescription(resultSet.getString("jobdescription"));
		j.setSalary(resultSet.getString("salary"));
		j.setSkills(resultSet.getString("skills"));
		j.setJoblocation(resultSet.getString("joblocation"));
		j.setContactperson(resultSet.getString("contactperson"));
		j.setContactpersonnumber(resultSet.getString("contactpersonnumber"));
		j.setCompanyname(resultSet.getString("companyname"));
		j.setCompanyemail(resultSet.getString("companyemail"));
		jobs.add(j);

		}
		return jobs;
		} catch (Exception e) {System.out.println(e);}
		return null;
		}

			
	public int addUserToJob(String companyName, String jobtitle, String email, String fullName, String mobileNo,
			String skills) {
		con=DBConnector.dbConnector();
		String query="insert into AppliedJobs values(?,?,?,?,?,?,?,?)";
		PreparedStatement st;
		try {
		st = con.prepareStatement(query);
		String Applied="Yes";
		String Approved="NO";
		st.setString(1, companyName);
		st.setString(2, jobtitle);
		st.setString(3, email);
		st.setString(4, fullName);
		st.setString(5, mobileNo);
		st.setString(6, skills);
		st.setString(7, Applied);
		st.setString(8, Approved);
		int i = st.executeUpdate();
		return i;
		} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		
		}		return 0;
	}
	public static Employee fetchEmployee(String email) {
		 
			con=DBConnector.dbConnector();
			String query="select * from employee where email=?";
			System.out.println("email from dao "+email);


			try {
			PreparedStatement st = con.prepareStatement(query);
			st.setString(1, email);
			ResultSet rs =st.executeQuery();
			while(rs.next()) {
			Employee emp=new Employee();
			emp.setEmail(rs.getString("email"));
			emp.setFaname(rs.getString("faname"));
			emp.setLaname(rs.getString("laname"));
			emp.setMobileno(rs.getString("mobileno"));
			emp.setUsernmae(rs.getString("username"));
			emp.setPassword(rs.getString("password"));
			emp.setGender(rs.getString("gender"));
			emp.setTechnicalskills(rs.getString("technicalskills"));
			emp.setCurrentrole(rs.getString("currentrole"));
			emp.setCompany(rs.getString("company"));
			emp.setExperience(rs.getString("experience"));
			System.out.println("from DAO :: "+emp);
			return emp;
			}
			} catch (SQLException e) {e.printStackTrace();}

			return null;
	
	}
	
	public int updateUserValue(String email, String faname, String laname, String mobileno, String username,
			String password, String gender, String technicalskills, String currentrole, String company,
			String experience) {
		try {
			con=DBConnector.dbConnector();
			String query="update employee SET faname=?,laname=?, mobileno=?,username=?,password=?,gender=?,technicalskills=?,currentrole=?,company=?,experience=? where email=?";
			PreparedStatement st = con.prepareStatement(query);
			       
			        st.setString(1, faname);
			        st.setString(2, laname);
			        st.setString(3, mobileno);
			        st.setString(4, username);
			        st.setString(5, password);
			        st.setString(6, gender);
			        st.setString(7, technicalskills);
			        st.setString(8, currentrole);
			        st.setString(9, company);
			        st.setString(10, experience);
			        st.setString(11, email);
			        int flag=st.executeUpdate();
			System.out.println("Updation Successful");
			return flag;
			} 
			catch (Exception e){System.out.println(e);}

		return 0;
	}
	public static Company fetchCompany(String email) {
		con=DBConnector.dbConnector();
		String query="select * from company where email=?";
		System.out.println("email from dao "+email);


		try {
		PreparedStatement st = con.prepareStatement(query);
		st.setString(1, email);
		ResultSet rs =st.executeQuery();
		while(rs.next()) {
		Company c=new Company();
		c.setCanme(rs.getString("canme"));
		c.setEmail(rs.getString("email"));
		c.setPassword(rs.getString("password"));
		c.setContactpersonnumber(rs.getString("contactperson"));
		c.setContactperson(rs.getString("contactpersonname"));
		c.setWebsite(rs.getString("website"));
		c.setUsernmae(rs.getString("username"));
		System.out.println("from DAO :: "+c);
		return c;
		}
		} catch (SQLException e) {e.printStackTrace();}
		return null;

		}
	public int UpdateCompanyValue(String email, String canme, String password, String website, String contactPerson,
			String contactPersonNumber, String username) {
		try {
			con=DBConnector.dbConnector();
			String query="update company SET canme=?,username=?,password=?,website=?,contactperson=?,contactpersonname=? where email=?";
			PreparedStatement st=con.prepareStatement(query);
			st.setString(1, canme);
			st.setString(2, username);
			st.setString(3, password);
			st.setString(4, website);
			st.setString(5, contactPerson);
			st.setString(6, contactPersonNumber);
			st.setString(7, email);
			  int flag=st.executeUpdate();
			  System.out.println(flag);
			System.out.println("Update successfully");
			return flag;
			} 
			catch (Exception e){System.out.println(e);
			}
			return 0;

		
	}
	public static List<TotalAppliedCandidates> appliedJobs() {
		List<TotalAppliedCandidates> TA = new ArrayList<TotalAppliedCandidates>();
		try {
		con = DBConnector.dbConnector();
		Statement statement = con.createStatement();
		ResultSet resultSet = statement.executeQuery("select * from appliedjobs");

		while (resultSet.next()) {
		TotalAppliedCandidates t = new TotalAppliedCandidates();
		t.setCompanyName(resultSet.getString("companyName"));
		t.setJobtitle(resultSet.getString("jobtitle"));
		t.setEmail(resultSet.getString("email"));
		t.setFullName(resultSet.getString("fullName"));
		t.setMobileNo(resultSet.getString("mobileNo"));
		t.setSkills(resultSet.getString("skills"));
		t.setApplied(resultSet.getString("Applied"));
		t.setApproved(resultSet.getString("Approved"));
		//t.setId(resultSet.getString("jobId"));
		System.out.println(t);
		   TA.add(t);
		}
		  return TA;
		} catch (Exception e) {System.out.println(e);}
		return null;
		}
	public int updateApprove(String jtitle, String company) {
		try {
			con=DBConnector.dbConnector();
			String Query="UPDATE appliedjobs SET Approved =? where jobtitle=? and companyName=? ";
			   String approve="YES";
			PreparedStatement st = con.prepareStatement(Query);
			st.setString(1, approve);
			st.setString(2, jtitle);
			st.setString(3, company);
			int i = st.executeUpdate();
			return i;
			}
			 catch (Exception e) {System.out.println(e);}
			return 0;
			}
	public static int ProfileCompleteStatusUser(String mail) {
		int count=0;
		String query="select * from employee where email=?";
		try {
		PreparedStatement st = con.prepareStatement(query);
		st.setString(1, mail);
		ResultSet rs =st.executeQuery();
		while(rs.next()) {
		Employee emp=new Employee();
		emp.setEmail(rs.getString("email"));
		emp.setFaname(rs.getString("faname"));
		emp.setFaname(rs.getString("laname"));
		emp.setMobileno(rs.getString("mobileno"));
		emp.setUsernmae(rs.getString("username"));
		emp.setPassword(rs.getString("password"));
		emp.setGender(rs.getString("gender"));
		emp.setTechnicalskills(rs.getString("technicalskills"));
		emp.setCurrentrole(rs.getString("currentrole"));
		emp.setCompany(rs.getString("company"));
		emp.setExperience(rs.getString("experience"));
		System.out.println("from DAO :: "+emp);
		count=computeUser(emp);
		return count;
		}

		}
		catch (Exception e) {System.out.println(e);}
		return 0;

		}


		private static int computeUser(Employee emp) {
		int count=0;
		if(emp.getFaname()!=null) {
		count++;
		if(emp.getLaname()!=null) {
		count++;
		if(emp.getMobileno()!=null) {
		count++;
		if(emp.getUsernmae()!=null) {
		count++;
		if(emp.getGender()!=null) {
		count++;
		if(emp.getTechnicalskills()!=null) {
		count++;
		if(emp.getCurrentrole()!=null) {
		count++;
		if(emp.getCompany()!=null) {
		count++;
		if(emp.getExperience()!=null)
		{
		count++;
		return count;
		}
		return count;
		}
		return count;
		}
		return count;
		}
		return count;
		}
		return count;
		}
		return count;
		}
		return count;
		}
		return count;
		}
		return 0;
		}
		
		
		
		
	}






