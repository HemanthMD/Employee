package testStep;

import Methods.Employees;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class VerifyGet {
	@Given("Calling Get Method")
	public void calling_get_method() {
	   Employees em= new Employees();
	   em.GetMethod();
	}

	@Then("executed Successfully")
	public void executed_successfully() {
	    System.out.println("get method is executed successfully");
	}
}
