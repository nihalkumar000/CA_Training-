package main.java;

import java.util.ArrayList;
import java.util.regex.Pattern;

public class UserEntries {
	ArrayList<User> userList = new ArrayList<User>();
	private Pattern pattern;
	private static final String Email_pattern = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
			+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
	public String addUser(User user){
		
		if (user.getEmail().equals("")){
			return "Email can't be empty";
		}
		else if (user.getUserName().equals("")){
			return "Name can't be empty";
		}
		else if (user.getPassword().equals("")){
			return "Password can't be empty";
		}
		/*else if (user.getEmail().matches("\^[A-Z0-9._%+-]+@[A-Z0-9.-]+\.[A-Z]{2,4}$.\"))
			return "Name can't be empty";
		}*/
		return null;
		
	}
	
}
