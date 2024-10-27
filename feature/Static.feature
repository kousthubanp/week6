Feature: Edit the Salesforce account

Scenario: Edit with static parameters
Given Launching Browser
When load the salesforce url
And enter in the username as dilip@testleaf.com
And enter in the password as leaf@2024
And click on the login
And Click the App Launcher Icon next to Setup
And Select Accounts
And  Search for the account using your unique account name.
And Click the dropdown icon next to the account and select Edit.
And Set Type to Technology Partner.
And Set Industry to Healthcare.
And Enter the Billing Address 'chennai'
And Enter the Shipping Address 'chennai'
And Set Customer Priority to Low.
And Set SLA to Silver.
And Set Active to NO.
And Enter a unique number in the Phone field '88888888'
And Set Upsell Opportunity to No.
Then Click Save and verify the phone number
