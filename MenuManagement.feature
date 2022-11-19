Feature: Menu Management
Background: Add basic item
	Given I have a menu item with name "Chicken Sandwich" and price 15
  When I add that menu item
  Then Menu Item with name "Chicken Sandwich" should be added
  
  @SmokeTest @RegularTest
Scenario: Add a menu item
  Given I have a menu item with name "Cucumber Sandwich" and price 20
  When I add that menu item
  Then Menu Item with name "Cucumber Sandwich" should be added

  @RegularTest
Scenario: Add a menu item
  Given I have a menu item with name "Chicken Sandwich" and price 15
  When I add that menu item
  Then I should see an error message with value "Duplicate item"