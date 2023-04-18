package software;
import java.util.ArrayList;
import java.util.List;

import software.AdminOfServec;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Distribute {
	private List<Order> orders = new ArrayList<>();
    private List<Worker> workers;

    @Given("there are available orders and workers")
    public void thereAreAvailableOrdersAndWorkers() {
        // Initialize orders and workers here
        orders = new ArrayList<>();
        workers = new ArrayList<>();
    }

    @When("an order is received")
    public void anOrderIsReceived() {
        String orderId = "123";
        String customerId = "456";
        String itemName = "Widget";
        int quantity = 2;
        // Create and add new order to orders list
        Order newOrder = new Order(orderId, customerId, itemName, quantity);
        orders.add(newOrder);
    }

    @Then("the order is assigned to an available worker")
    public void theOrderIsAssignedToAnAvailableWorker() {
        // Find an available worker and assign the order
        for (Worker worker : workers) {
            if (worker.isAvailable()) {
                worker.assignOrder(orders.get(orders.size() - 1));
                break;
            }
        }
    }
}

