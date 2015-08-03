package main.java;

public class loginCheck {
	public String check(Person p){
		if(p.getName()==null)
		return "Username cannot be blank";
		else if(p.getPassword()==null)
			return "Password Cannot Be Blank";
		else if(p.getPassword().equals("INVALID")||p.getName().equals("INVALID"))
			return "Wrong Credentials";
		return "Login Successful";
	}
}
