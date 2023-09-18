Feature: SwagLabs Login page feature

Scenario: Login page title
Given user is on login page
When user gets the title of the page
Then page title should be "Swag Labs"

Scenario: Login Button Displayed
Given user is on login page
Then login button should be displayed

Scenario: Login with correct credentials
Given user is on login page
When user enters username "standard_user"
And user enters password "secret_sauce"
And user clicks on Login button
Then user gets the title of the page
And page title should be "Swag Labs"


