Feature: Add To Cart Feature

Background:
Given user has already logged in to the application
|username|password|
|standard_user|secret_sauce|

Scenario: Add to cart and check
Given user is on accounts page
When user clicks on add to cart button
And user clicks on cart
Then user gets the list of items in cart

