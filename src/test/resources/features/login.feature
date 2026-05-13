Feature:Login Functionality

  Scenario: Verify login with valid credentials
    Given user is on the login page
    When user provides the emailID "test4587@gmail.com" and password "test4587"
    Then user should see the home page