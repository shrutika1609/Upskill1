
Feature: Login Features
This feature includes scenario that would validate the following features.
1.Signup
2.Login
3.Send e-mail.

Background: 
Given I am able to naviagte onto the Signup page


Scenario: Set up Signup
When I click on the Signuplink
And I Enter the First name  as 'Shruti' 
And I Enter the Last name  as 'a' 
And I enter the  email as 'shradina@in.ibm.com'
And I enter Username as 'admin169'
And I enter Pass as 'admin@1234'
And I enter Confirm password as 'admin@1234'
And I press 'Register'
Then I should see the message "registered"

Scenario: Login as Admin
When I Enter the username as "Admin169" 
And I Enter the password as "admin@1234" 
And I click on the login button
And I Click on the link "Dropdown"
And I click on the "Inbox"
And I click on the message "Compose message"
And I enter the send to as "naveen1"
And I enter Subject as "testing"
And I enter message as "This is for testing"
Then I click on send message button. 




    
    


