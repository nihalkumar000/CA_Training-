Feature: Registration
Scenario: Successful Registration
Given user enters name as "pqr", email as "pqr@cdf.com", password as "tuv", phone as "+91XXXXXXXXXX"
When click on "Submit"
Then Register user and display a message "Registration Successful"

Scenario: Name cannot be blank
Given user enters name as "", email as "pqr@cdf.com", password as "tuv", phone as "+91XXXXXXXXXX"
When click on "Submit"
Then Register user and display a message "Name can't be empty"

Scenario: email cannot be blank
Given user enters name as "pqr", email as "", password as "tuv", phone as "+91XXXXXXXXXX"
When click on "Submit"
Then Register user and display a message "Email can't be empty"

Scenario: Password cannot be blank
Given user enters name as "pqr", email as "pqr@cdf.com", password as "", phone as "+91XXXXXXXXXX"
When click on "Submit"
Then Register user and display a message "Password can't be empty"


Scenario: Invalid Email Format
Given user enters name as "pqr", email as "pqr.com", password as "tuv", phone as "+91XXXXXXXXXX"
When click on "Submit"
Then Register user and display a message "Email format Incorrect"


Scenario: Email already Exists
Given user enters name as "abc", email as "abc@cdf.com", password as "tuv", phone as "+91XXXXXXXXXX"
When click on "Submit"
Then Register user and display a message "User already exists Please proceed to Login"

