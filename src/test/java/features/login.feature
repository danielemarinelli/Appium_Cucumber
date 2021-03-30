
Feature: Testing login to pocket shop

  @appium
  Scenario Outline: Testing login to pocket shop
    Given User opens pocket shop app
    When  User inserts user <user> and password <password>
    And   User taps on button login
    And   User taps on agree button
    Then  User navigates in the personal account
    When  User taps on the cart button
    And   User taps add product
    And   User taps calculate button
    Then  The total vat changes
    And   User taps on checkout button
    And   User taps on confirm button

    Examples:
      | user |password|
      |chris@aphixsoftware.com|test|
      |dan_guest              |test1|