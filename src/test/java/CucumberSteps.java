package test.java;
import junit.framework.TestCase;
import main.java.Ride;
import main.java.RidePosting;
import main.java.loginCheck;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CucumberSteps extends TestCase{
	Ride ride = new Ride();
	String actionButton;
	@Given("^user has entered valid data$")
	public void user_has_entered_valid_data() throws Throwable {
	    // Express the Regexp above with the code you wish you had
//	    throw new PendingException();
		ride.setEmployeeName("Ride Test User");
		ride.setSource("AirportRoad");
		ride.setDestination("Koramangala");
		ride.setEmail("rider@gmail.com");
		ride.setStartTime("6:30");
		ride.setPhone("944483321");
	}
	
	@Given("^user has not entered valid data$")
	public void user_has_not_entered_valid_data() throws Throwable {
	    // Express the Regexp above with the code you wish you had
//	    throw new PendingException();
		ride=null;
	}

	@Given("^user has entered name as \"([^\"]*)\" and source as \"([^\"]*)\", destination as \"([^\"]*)\",  startTime as \"([^\"]*)\", email as \"([^\"]*)\"$")
	public void InvalidName(String userName, String source, String destination, String startTime, String email) throws Throwable {
	    // Express the Regexp above with the code you wish you had
//	    throw new PendingException();
		ride.setEmployeeName(userName);
		ride.setEmail(email);
		ride.setSource(source);
		ride.setDestination(destination);
		ride.setStartTime(startTime);
	}


	@When("^click on \"([^\"]*)\"$")
	public void click_on(String buttonName) throws Throwable {
	    // Express the Regexp above with the code you wish you had
//	    throw new PendingException();
		actionButton = buttonName;
	}

	@Then("^system should display a message \"([^\"]*)\"$")
	public void system_should_display_a_message(String value) throws Throwable {
	    // Express the Regexp above with the code you wish you had
//	    throw new PendingException();
		RidePosting posting = new RidePosting();
		assertEquals(value, posting.SaveRide(ride));
	}
	
	@Given("^user enters name as \"([^\"]*)\", email as \"([^\"]*)\", password as \"([^\"]*)\", phone as \"([^\"]*)\"$")
	public void registerUser(String userName, String email, String password, String phone) throws Throwable {
	    // Express the Regexp above with the code you wish you had
//	    throw new PendingException();
		
	}
	@Then("^Register user and display a message \"([^\"]*)\"$")
	public void Register_user_and_display_a_message(String arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
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


}
