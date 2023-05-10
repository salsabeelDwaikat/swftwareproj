package software;
import java.util.ArrayList;
import java.util.List;

import java.util.ArrayList;
import java.util.List;

public class Worker {
    private String name;
    private List<Order> assignedOrders;
    
    public Worker(String name) {
        this.name = name;
        assignedOrders = new ArrayList<>();
    }

    public boolean isAvailable() {
        return assignedOrders.size() < 5;
    }

    public void assignOrder(Order order) {
        assignedOrders.add(order);
        System.out.println("Order with ID " + order.getOrderId() + " assigned to " + name);
    }

    public void distributeOrders(List<Order> orders) {
        for (Order order : orders) {
            if (isAvailable()) {
                assignOrder(order);
            } else {
                System.out.println("Worker " + name + " is not available for order " + order.getOrderId());
            }
        }
    }

}

