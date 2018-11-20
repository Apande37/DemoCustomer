package custAcc;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import com.cg.demo.Address;
import com.cg.demo.Customer;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinitions {

	private Customer customer;
	private double openingBalance;

@Given("^Customer and opening balance$")
public void customer_and_opening_balance() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	Address address=new Address("Northavenue","Pune");
	customer=new Customer("rahul","Gupta",address);
	openingBalance=5000;
	
 
}

@When("^for Valid customer$")
public void for_Valid_customer() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	
	assertNotNull(customer);
}

@When("^valid opening balance create account no$")
public void valid_opening_balance_create_account_no() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	
	assertTrue(openingBalance>500);
}

@Then("^create account and store it into db$")
public void create_account_and_store_it_into_db() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    
}


	
	
	
}
