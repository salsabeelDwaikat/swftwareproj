Feature: Discount System

Scenario: Customer receives discount for frequent use of service

Given the customer has used the service
When the customer's usage amount is greater than 400 NIS
Then a 10% discount is applied to the customer's order
