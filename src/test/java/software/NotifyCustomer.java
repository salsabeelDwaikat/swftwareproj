package software;
import javax.mail.PasswordAuthentication;
import java.util.Properties;
import javax.mail.Authenticator;
import javax.mail.*;
import javax.mail.internet.*;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NotifyCustomer {
    private Order order;
    
    @Given("the customer has used the service")
    public void theCustomerHasUsedTheService() {
        // Create a sample order to use in the scenario
        order = new Order("1234", "5678", "Item 1", 2);
    }
    
    @When("the customer's usage amount is greater than {int} NIS")
    public void theCustomerSUsageAmountIsGreaterThanNIS(Integer amount) {
        // No action required for this step
    }
    
    @Then("a {int}% discount is applied to the customer's order")
    public void aDiscountIsAppliedToTheCustomerSOrder(Integer discountPercentage) {
        // Apply the discount to the order
        double discountAmount = (discountPercentage.doubleValue() / 100) * order.getTotalPrice();
        order.setTotalPrice(order.getTotalPrice() - discountAmount);
        
        // Send email to customer
        String fromEmail = "your_email@example.com";
        String toEmail = "customer_email@example.com";
        final String username = "your_email_username";
        final String password = "your_email_password";
        
        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");

        Session session = Session.getInstance(props,
            new javax.mail.Authenticator() {
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication(username, password);
                }
            });

        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(fromEmail));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(toEmail));
            message.setSubject("Your Order Has Been Completed!");
            message.setText("Dear Customer,"
            	    + "\n\n Your order has been completed! Here are the order details:"
            	    + "\n Order ID: " + order.getOrderId()
            	    + "\n Customer ID: " + order.getCustomerId()
            	    + "\n Item Name: " + order.getItemName()
            	    + "\n Quantity: " + order.getQuantity()
            	    + "\n Total Price: " + order.getTotalPrice()
            	    + "\n\n A discount of " + discountPercentage + "% has been applied to your order."
            	    + "\n Thank you for using our service!");



            Transport.send(message);

            System.out.println("Email sent successfully!");

        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    }
}




