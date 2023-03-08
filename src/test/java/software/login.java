package software;

import software.AdminOfServec;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class login {

	
	Servec servec;
	AdminOfServec admin = new AdminOfServec() ;
	boolean login;
    //login=admin.login();

	public void adminLogIn(Servec s) {
		//super();
		servec=s;
	}
		
		@Given("Admin selected to log in")
		public void adminSelectedToLogIn() {
			 {
			    System.out.println("Welcome");
			}

		}
		
		@When("Admin entered the valid {string} and the valid {string}")
		public void adminEnteredTheValidAndTheValid(String username, String password) {
			
			admin.setUsername(username);
		    admin.setPasword(password);
		    login=admin.login();
		}
		
		@Then("log in must be successful")
		public void logInMustBeSuccessful() {
			equals(login);
		}


		@When("Admin entered the valid {string} and the unvalid {string}")
		public void adminEnteredTheValidAndTheUnvalid(String username, String password) {
			admin.setUsername(username);
		    admin.setPasword(password);
		    login=admin.login();
		}

		@Then("log in must be field")
		public void logInMustBeField() {
			equals(!login);
		//	assertTrue(!login);
		}

	

}
