package software;

import software.AdminOfServec;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Discount {
    private double usageAmount;
    
    @Given("the customer has used the service")
    public void theCustomerHasUsedTheService() {
        // Assume customer has used the service
    }
    
    @When("the customer's usage amount is greater than {int} NIS")
    public void theCustomerSUsageAmountIsGreaterThanNIS(Integer amount) {
        usageAmount = amount;
    }
    
    @Then("a {int}% discount is applied to the customer's order")
    public void aDiscountIsAppliedToTheCustomerSOrder(Integer discountRate) {
        double discount = usageAmount * (discountRate / 100.0);
        double discountedAmount = usageAmount - discount;
        System.out.printf("Congratulations! You qualify for a %d%% discount!\n", discountRate);
        System.out.printf("Your total amount after discount is: %.2f NIS\n", discountedAmount);
    }
}

