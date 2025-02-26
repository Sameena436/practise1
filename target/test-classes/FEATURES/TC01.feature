Feature: TC01 Orange HRM Apllication - automating skills functionality
	
Background: Common steps
    Given User launch chrome browser
    When User opens URL "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"

Scenario: TC01 Add Skills record - I am creating skills record
    And User enters username as "Admin" and password as "admin123"
    Then Go to Skill Page
    When Add skills with skillname as "Java11" and skilldescription as "Java11 descr"
    When Click on logout button
    Then Close Browser

