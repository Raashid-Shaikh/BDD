package stepdefinitions;

import java.util.List;
import java.util.Map;

import factory.DriverFactory;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AccountsPage;
import pages.LoginPage;
import pages.addToCartPage;

public class addToCartDefinition {
	
    private addToCartPage AddToCartPage;

    
	  public addToCartDefinition() {
	        // Initialize the AddToCartPage here
	        AddToCartPage = new addToCartPage(DriverFactory.getDriver());
	       
	    }


	
	
	
	@When("user clicks on add to cart button")
	public void user_clicks_on_add_to_cart_button() throws InterruptedException{
	    // Locate and click the "Add to Cart" button
	    // Implement the logic to click the button here
		AddToCartPage.addProduct();
		
		
	}
	
	@And("user clicks on cart")
	public void user_selects_the_cart() {
	    // Locate and click the "Cart" link or button to view the cart
	    // Implement the logic to select the cart here
		AddToCartPage.clickOnCart();

	}
	
	@Then("user gets the list of items in cart")
	public void user_gets_the_list_of_items_in_the_cart() {
	    // Implement logic to retrieve the list of items in the cart
	    // This could involve finding and reading elements that represent the cart items
	    // You can then store this information in a data structure or print it
		System.out.println("List Items");
		AddToCartPage.CartIncludedProducts();
	}
	

	
}
