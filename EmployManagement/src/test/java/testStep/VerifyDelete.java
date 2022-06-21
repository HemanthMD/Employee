package testStep;

import Methods.Employees;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class VerifyDelete {
	@Given("Calling Delete Method")
	public void calling_delete_method() {
	Employees em3=new Employees();
	em3.DeleteMethod();
	}

	@Then("Deleted id Successfully")
	public void deleted_id_successfully() {
	  System.out.println("Deleted Successfully");
	}

}
