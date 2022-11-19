package stepdefinitions;

import static org.junit.Assert.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import linkedinlearning.cucumbercourse.RestaurantMenu;
import linkedinlearning.cucumbercourse.RestaurantMenuItem;


public class MenuManagementSteps {
    RestaurantMenuItem NewMenuItem;
    
    RestaurantMenu LocationMenu = new RestaurantMenu();
    String ErrorMessage;
    
    public MenuManagementSteps() {
    	System.out.println("Constructor called");
    }
    @Given("I have a menu item with name {string} and price {int}")
    public void i_have_a_menu(String newMenuItemName, Integer price) {

    NewMenuItem = new RestaurantMenuItem(newMenuItemName,newMenuItemName,price);
    }
    @When("I add that menu item")
    public void add_menu_item() {
    	try {
        LocationMenu.addMenuItem(NewMenuItem);
    	}
    	catch (IllegalArgumentException ex) {
            ErrorMessage = ex.getMessage();
        }
    }
    @Then("Menu Item with name {string} should be added")
    public void menu_item_added(String string) {
        boolean Exists = LocationMenu.DoesItemExist(NewMenuItem);
    }
    @Then("I should see an error message with value {string}")
    public void i_should_see_an_error_message_with_value(String string) {
        
        assertEquals("Duplicate item", ErrorMessage);
    }
}
