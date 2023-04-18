Feature: Distribute orders to available workers

  As a manager
  I want to distribute orders to available workers
  So that all orders are completed efficiently
  
  Scenario: Distribute an order to an available worker
    Given there is an order to be completed
    And there is an available worker to complete the order
    When the manager assigns the order to the worker
    Then the order is assigned to the worker
    
  Scenario: No available workers to complete an order
    Given there is an order to be completed
    And there are no available workers to complete the order
    When the manager tries to assign the order
    Then an error message is displayed
