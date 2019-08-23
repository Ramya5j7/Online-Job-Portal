<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="jobportal.Bean.Company"%>
<!DOCTYPE html>
<html>
<head>
<style>    
body {
background: url("http://www.bestfunforall.com/better/imgs/Background%20HD%20wallpaper%20%202.jpeg");
background-size: cover;
}
#signup {
padding-top: 50px;
}
h1, p {
text-align: center;
color:gold ;
}
h1 {
font-family: 'Titillium Web', sans-serif;
font-size: 40px;
line-height: 10px;
style="color: gold";
}
p {
font-family:'Open Sans', sans-serif;
style="color: gold";
}
#container {
width: 400px;
height: 600px;
background-color: #7F7979;
margin: auto;
border-radius: 10px;
}
form {
width: 100%;
display: inline-block;
text-align: center;
padding-top: 50px;
}
input {
width: 75%;
padding: 15px;
margin: 8px 0;
border-radius: 5px;
}
input[type=submit] {
width: 50%;
background-color: #FFE066;
border: none;
color: #1a1a1a;
}
</style>
</head>
<%Company c=(Company)request.getAttribute("UpdatedCompObj"); 

if(c!=null){
%>
<body>
<div id="signup">
<h1>Update!</h1>
<p>Welcome!!</p>
<div id="container">
<form action="UpdateCompanyValues" method="post">

<input type="email" placeholder="E-mail Id" name="email"  pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,}$" value="<%=session.getAttribute("CompanyName") %>"required><br />
<input type="text" placeholder="Company Name" name="username" value="<%=c.getCanme() %>"required><br />
<input type="text" placeholder="Web-Address" name="web" value="<%=c.getWebsite() %>" required><br />
<input type="text" placeholder="Username" name="username" value="<%=c.getUsernmae() %>"required><br />
<input type="password" placeholder="Password" name="password" pattern=".{6,}" value="<%=c.getPassword() %>"required><br />
<input type="text" placeholder="contact-Person" name="contactPerson" value="<%=c.getContactperson() %>" required><br />
<input type="text" placeholder="Contact-Person-Number" name="contactNumber" value="<%=c.getContactpersonnumber() %>"  required><br />
<input type="submit" value="submit">
</form>
<%} %>
</div>
</div>
</body>

</body>
</html>