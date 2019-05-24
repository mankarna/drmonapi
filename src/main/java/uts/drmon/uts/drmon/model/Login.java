package uts.drmon.uts.drmon.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "login")
public class Login {
public String username;
public String password;
public String emailid;
public String mobileno;
public String designation;
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getEmailid() {
	return emailid;
}
public void setEmailid(String emailid) {
	this.emailid = emailid;
}
public String getMobileno() {
	return mobileno;
}
public void setMobileno(String mobileno) {
	this.mobileno = mobileno;
}
public String getDesignation() {
	return designation;
}
public void setDesignation(String designation) {
	this.designation = designation;
}
public Login(String username, String password, String emailid, String mobileno,
		String designation) {
	
	this.username = username;
	this.password = password;
	this.emailid = emailid;
	this.mobileno = mobileno;
	this.designation = designation;
}
public Login() {
	
}


}
