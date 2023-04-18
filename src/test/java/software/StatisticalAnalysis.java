package software;
import javax.mail.PasswordAuthentication;
import java.util.Properties;
import javax.mail.Authenticator;
import javax.mail.*;
import javax.mail.internet.*;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StatisticalAnalysis{
int usageAmount; // declared as global variable

@Given("the customer has used the service")
public void theCustomerHasUsedTheService() {
    // Assume that the customer has used the service
}

@When("the customer's usage amount is greater than {int} NIS")
public void theCustomerSUsageAmountIsGreaterThanNIS(Integer minAmount) {
    usageAmount = 500; // Assume that the customer's usage amount is 500 NIS for testing purposes
    if (usageAmount > minAmount) {
        // The customer's usage amount is greater than the minimum amount required for discount
    } else {
        // The customer's usage amount is less than or equal to the minimum amount required for discount
        throw new io.cucumber.java.PendingException("Customer's usage amount is less than or equal to " + minAmount + " NIS");
    }
}

@Then("a {int}% discount is applied to the customer's order")
public void aDiscountIsAppliedToTheCustomerSOrder(Integer discountPercentage) {
    double discount = (usageAmount * discountPercentage) / 100.0; // Calculate the discount amount
    System.out.println("Discount applied: " + discount + " NIS");
    // Apply the discount to the customer's order
    // Assume that the order has been successfully discounted
}
}