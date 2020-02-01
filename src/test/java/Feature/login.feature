Feature: Loging feature
  This feature is login functonality of application

  Scenario: As a user i can login to application with correct userName and passWord
    Given I navigate to login page
    When i enter correct username and password
    And I click on signIn button
    Then I can see login successfull message appeared
