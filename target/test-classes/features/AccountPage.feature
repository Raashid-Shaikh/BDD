
Feature: Account Page Feature

Background:
Given user has already logged in to the application
|username|password|
|standard_user|secret_sauce|

@accounts
Scenario: Account Page Title
Given user is on accounts page
When user gets the title of the page
Then page title should be "Swag Labs"

@accounts
Scenario: Accounts section count
Given user is on accounts page
Then user gets account section
|Sauce Labs Backpack|
|Sauce Labs Bike Light|
|Sauce Labs Bolt T-Shirt|
|Sauce Labs Fleece Jacket|
|Sauce Labs Onesie|
|Test.allTheThings() T-Shirt (Red)|
And accounts section count should be 6
