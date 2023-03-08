package software; 

import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class logout<Servec>{
	
	private static final String Servec = null;
	Servec servec;
	boolean a;
	
	public void adminLogOut(Servec s) {
		//super();
		servec=s;
	}
	
@Given("that the user is logged_in")
public void thatTheUserIsLoggedIn() {
	System.out.println("Out Servec");
}

@When("the user logs out")
public void theUserLogsOut() {
	 a=Servec.admin1.logout(username);
}


@Then("the user is not logged in")
public void theUserIsNotLoggedIn() {
	equals(!a);
}

}

//
