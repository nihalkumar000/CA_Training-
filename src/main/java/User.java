package main.java;

public class User {
	String userName;
	String email;
	String password;
	String phone;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public User(String userName, String email, String password, String phone) {
		this.userName = userName;
		this.email = email;
		this.password = password;
		this.phone = phone;
	}
	
}
