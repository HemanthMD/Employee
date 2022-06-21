package testStep;

import Methods.Employees;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class VerifyGet1 {
	@Given("Calling Get Method for single id")
	public void calling_get_method_for_single_id() {
	   Employees em4=new Employees();
	   em4.GetSingleid();
	}

	@Then("get the id Successfully")
	public void get_the_id_successfully() {
	    System.out.println("executed and got single id");
	    }

}
