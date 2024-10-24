Feature: Create account in Salesforce application

Scenario: login with valid credentials 
Given Launch the Webbrowser
When load the url
And Enter username dilip@testleaf.com
And Enter password leaf@2024
And click on the login button 
When click on the toggle button on the left
And click on the view all
And click on the sales tab
And click on the accounts tab
And click on the new tab
And Enter in the accountname as kousthu
And select public in ownership
Then Save and verify 
