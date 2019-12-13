Feature: Search and place order for vegetables

@SeleniumTest
Scenario: Search for items and validate results
Given User is on Greenkart landing page
When User searches for "Cucumber" vegetable
Then "Cucumber" results are displayed

@SeleniumTest
Scenario: Search for items and move to checkout page
Given User is on Greenkart landing page
When User searches for "Brinjal" vegetable
And Add adds items to cart
And User proceeds to checkout page
Then Selected "Brinjal" item is displayed in checkout page
