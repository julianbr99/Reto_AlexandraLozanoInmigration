Feature: register in utest
  me as a web user,
  I need to fill out the form,
  to be registered

  Scenario: successfully fill out the utest form
    Given el  user, entry the utest web
    When user fills out form
    Then the user will be shown the message: <Welcome to the world's largest community of freelance software testers!>


