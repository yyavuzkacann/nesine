Feature: Check Coupons
  Scenario: Login with credentials from service and check coupons
    Given get credentials from service
    When login
    When go to popular coupons page
    Then check page url
    When read coupons from service
    Then assert the numbers


