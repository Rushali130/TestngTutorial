
@tag
Feature: Purchase the order from Ecommerce website


Background:
Given I landed on Ecommerce page

  @tag2
  Scenario Outline: Positive test of submitting the order
    Given Logged in with Username <name> and password <password>

    When I add <productname> to cart
    And Checkout <productname> and submit the order
    Then "THANKYOU FOR THE ORDER."message is displayed on ConfirmationPage.

    Examples:
      | name              | password  | productname |
      | rushali@gmail.com | Magnet123 | ZARA COAT 3 |
