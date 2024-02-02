Feature: register in utest
  me as a web user,
  I need to fill out the form,
  to be registered

  Scenario: Book taxi from airport one way
    Given the user is on the taxis reservation page
    When enters the data  to  of the first and last name incorrecty
    Then  you will see the error message
