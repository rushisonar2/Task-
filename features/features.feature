
Feature: Login Functionality for the reddit app in Mobile Browser.
 

 
  Scenario Outline: Successful Login with the valid credentials.
    Given I am on the reddit login page 
    When I entered "<username>" and "<password>"
    And I click on the "Login"  button
    Then See the Home Page
    
Examples: 
      | usermane           |    password        | status  |
      | gulabsr55@gmail.com|    Rushi@222       | success |
      | abc123@gmail.com   |    Admin@123       | Fail    |
