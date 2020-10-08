Feature: Employee feature
  Background:  Given user is on the homepage
    When user enter username as "Admin" and password as "admin123"
    And user click on login button
    And  Hover over on PIM
    And user click on Add Employee

  Scenario: to verify user should be able to assign username for existing employee with specific role
    And user enter firstName as "Radha" and lastName as "Krishna"
    And user upload Photo
    And user click on create login details
    And user enter username as "Radha.Krishna",password as "Sitaram1" and confirmPassword as "Sitaram1"
    And user click on save button
    And click on admin tab
    And click on add
    And user select User roles
    And user enter employeeName as"Radha Krishna",username as"Radha1.Krishna" ,password as "Sitaram1" and confirmPassword as "Sitaram1"
    And user click on save button
    Then user verify by entering username as "Radha1.Krishna" to search in the database
    And user click on search button
    And click on Logout
    And user enter username as "Radha1.Krishna" and password as "Sitaram1"
    And user click on login button
    Then verify user is able to login successfully with message "Welcome Radha"


  Scenario: to verify user should able to add Employee successfully
    And  user fill all the compulsory fields
    And user click on save button
    And User edit personal details and fill License Expiry ,Marital Status and DOB
    And user click on save button
#   Then user verify "Successfully Saved" message displayed
    And user click on Employee list
    And user search  Employee by ID
    Then verify same employee is present in data base at bottom


#  Scenario Outline:
#    And user enter firstName as "<firstName>" and lastName as "<lastName>"
#    And user click on save button
#    And User edit personal details and fill License Expiry ,Marital Status and DOB
#    And user click on save button
##   Then user verify "Successfully Saved" message displayed
#    And user click on Employee list
#    And user search  Employee by ID
#    Then verify same employee is present in data base at bottom
#    Examples:
#  |firstName|lastName|
#  |Honda1   |Jazz1   |













#    And user fill all the compulsory fields
#    And user click on save button
#    And user enter personal details
#    And User click on save it
#    And user verify "Successfully Saved" message displayed
#    And user click on Employee list
#    And user Search employee by ID
#    Then same employee is present in data base at bottom
