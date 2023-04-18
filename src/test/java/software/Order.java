package software;
public class Order {
    private String orderId;
    private String customerId;
    private String itemName;
    private int quantity;
    private double totalPrice;

    public Order(String orderId, String customerId, String itemName, int quantity) {
        this.orderId = orderId;
        this.customerId = customerId;
        this.itemName = itemName;
        this.quantity = quantity;
        this.totalPrice = calculateTotalPrice();
    }

    // Getters
    public String getOrderId() {
        return orderId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public String getItemName() {
        return itemName;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    // Setters
    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    // Private methods
    private double calculateTotalPrice() {
        // Calculate total price based on quantity and item price
        double itemPrice = 10.0; // replace with actual item price
        return quantity * itemPrice;
    }
}

