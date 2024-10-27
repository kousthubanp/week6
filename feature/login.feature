Feature: Login functionality of Leaftaps Application
Background: 
Given Launch the browser
When Load the url
@sanity
Scenario: Login with valid credentials
When Enter in the username as 'DemoCSR'
And Enter in the password as crmsfa
And Click the Login Button
Then It should move to Homepage
@smoke
Scenario: Login with valid credentials
When Enter in the username as 'Demo'
And Enter in the password as crmsfa
And Click the Login Button

