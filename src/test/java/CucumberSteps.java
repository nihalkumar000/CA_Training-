package test.java;

import junit.framework.TestCase;
import main.java.Person;
import main.java.Ride;
import main.java.RidePosting;
import main.java.loginCheck;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CucumberSteps extends TestCase {
	
	Ride ride =  new Ride();
	String actionButton;
	Person details = new Person();
	
	@Given("^user has entered valid data$")
	public void user_has_entered_valid_data() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    //throw new PendingException();
	ride.setDestination("Koramangala");
	ride.setSource("Airport Road");
	ride.setEmail("xyz@gmail.com");
	ride.setPhone("9611095820");;
	ride.setStartTime("8.00");
	ride.setEmployeeName("Rohit Pathak");
	}

@Given("^user has entered invalid data$")
public void user_has_entered_invalid_data() throws Throwable {
    // Express the Regexp above with the code you wish you had
    throw new PendingException();
}

@Given("^user enter name as \"([^\"]*)\" and source as \"([^\"]*)\", destination as \"([^\"]*)\"$")
public void user_enter_name_as_and_source_as_destination_as(String name, String source, String destination) throws Throwable {
    // Express the Regexp above with the code you wish you had
	ride.setDestination(destination);
	ride.setEmployeeName(name);
	ride.setSource(source);
    throw new PendingException();
}




	@When("^click on \"([^\"]*)\"$")
	public void click_on(String arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    //throw new PendingException();
		actionButton=arg1;
	}

	@Then("^system should display a message \"([^\"]*)\"$")
	public void system_should_display_a_message(String arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    //throw new PendingException();
		RidePosting posting = new RidePosting();
		assertEquals(arg1,posting.SaveRide(ride)); 
	}

	
	@Given("^user has entered valid username and password$")
	public void user_has_entered_valid_username_and_password() throws Throwable {
	    // Express the Regexp above with the code you wish you had
		details.setName("nihal");
		details.setPassword("kumar");
	}

	@Given("^user has entered invalid username or password$")
	public void user_has_entered_invalid_username_or_password() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    details.setName("INVALID");
	    details.setName("INVALID");
		//throw new PendingException();
	}
	@Given("^user has entered username as \"([^\"]*)\" and password as \"([^\"]*)\"$")
	public void user_has_entered_username_as_and_password_as(String arg1, String arg2) throws Throwable {
	    // Express the Regexp above with the code you wish you had
		details.setName(arg1);
		details.setPassword(arg2);
//	    throw new PendingException();
	}	
	
	


	@When("^Click on \"([^\"]*)\"$")
	public void Click_on(String arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
		actionButton = arg1;
		//new PendingException();
	}

	@Then("^system should display a message1\"([^\"]*)\"$")
	public void system_should_display_a_message1(String arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
		loginCheck lCheck=new loginCheck();
		assertEquals(arg1,lCheck.check(details));
		//throw new PendingException();
	}

	



	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public CucumberSteps() {
		// TODO Auto-generated constructor stub
	}

}
