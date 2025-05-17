Feature: Order feature
  Scenario Outline: Place order for multiple products individually
    Given User is on login page
    When User logs in to the application with username "standard_user" and password "secret_sauce"
    Then User is navigated to home page
    And Add "<product>" to cart
    And Click on the cart
    Then User lands on cart page
    And Click on checkout
#    Then User lands on checkout page
#    And User enter all the checkout details
#    And User click on continue
#    Then User lands on order verification page
#    And User validates the <product>
#    And User clicks on Finish
#    Then User lands on thank you page

    Examples:
      | product |
      | Sauce Labs Bolt T-Shirt |
#      | Sauce Labs Fleece Jacket |