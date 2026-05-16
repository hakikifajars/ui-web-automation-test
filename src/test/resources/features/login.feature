Feature: Login functionality on SauceDemo

  Scenario: Positive login with valid username and password
    Given user opens SauceDemo login page
    When user inputs username "standard_user"
    And user inputs password "secret_sauce"
    And user clicks login button
    Then user should be redirected to inventory page

  Scenario: Negative login with invalid password
    Given user opens SauceDemo login page
    When user inputs username "standard_user"
    And user inputs password "wrong_password"
    And user clicks login button
    Then user should see error message

  Scenario: Boundary login with very long username
    Given user opens SauceDemo login page
    When user inputs username "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"
    And user inputs password "secret_sauce"
    And user clicks login button
    Then user should see error message