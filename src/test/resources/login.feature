Feature: Login 
As a user
I want to be able to login successfully
So that I can use the website

Scenario: Successful Login
Given user has entered valid username and password
When Click on "Login"
Then system should display a message1 "Login Successful"

Scenario: Unsuccessful Login
Given user has entered invalid username or password
When Click on "Login"
Then sytem should display a message1 "Wrong Credentials"

Scenario: Username cannot be blank
Given user has entered username as "" and password as "password"
When click on "Login"
Then system should display a message1 "Username cannot be blank"

Scenario: Password cannot be blank
Gieven user has entered username as "user" and password as "" 
When click on "Login"
Then system should display a message1 "Password Cannot Be Blank"

