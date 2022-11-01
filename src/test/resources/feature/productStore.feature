#Language en
#Author : Flor Sanchez

Feature: searching product

  Scenario: opening web page
    Given Customer searching a device
    And adding a product to the cart
    Then accept pop up confirmation.

  Scenario: adding second product
    Given Customer searching a new device
    And adding the new product to the cart
    Then accept pop up new confirmation

  Scenario: Navigate to Cart
    Given customer delete the new device from the cart
    And click on place order
    Then fill in all web form fields

  Scenario: Click on Purchase
    Given Capture and log purchase Id and Amount
    And Assert purchase amount equals expected
    Then Click on Ok

