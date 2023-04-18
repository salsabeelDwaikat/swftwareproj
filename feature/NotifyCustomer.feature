Feature: Notify customer by email when order is complete

As a customer
I want to receive an email notification when my order is complete
So that I can pick up my order

Scenario: Receive email notification when order is complete
Given I have placed an order
And the order has been completed
When the order is marked as complete
Then I receive an email notification that my order is ready for pickup.