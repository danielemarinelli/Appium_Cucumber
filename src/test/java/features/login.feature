
Feature: Testing login to pocket shop

  @appium
  Scenario Outline: Testing login to pocket shop
    Given User opens pocket shop app
    When  User inserts user <user> and password <password>
    And   User clicks on button login
    And   User clicks on agree button
    Then  User navigates in the personal account
    When  User clicks on the cart button
    And   User clicks add product
    And   User clicks calculate button
    Then  The total vat changes
    And   User clicks on checkout button
    And   User clicks on confirm button

    Examples:
      | user |password|
      |chris@aphixsoftware.com|test|
     # |dan                    |test1|