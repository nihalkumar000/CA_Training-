Feature: Quick Post

As a employee
I want to share a ride
So that anyone can travel with me

Scenario: Valid Post
Given user has entered valid data
When click on "Submit"
Then system should display a message "Post was successful."

Scenario: Invalid Post
Given user has entered invalid data
When click on "Submit"
Then system should display a message "Post was unsuccessful."

Scenario: username cannot be blank
Given user enter name as "" and source as "ABC", destination as "XYZ"
When click on "Submit"
Then system should display a message "Name cannot be blank."

Scenario: Source cannot be blank
Given user enter name as "shubham" and source as "", destination as "XYZ"
When click on "Submit"
Then system should display a message " Source cannot be blank"
