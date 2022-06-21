package testStep;

import java.io.FileNotFoundException;

import Methods.Employees;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class VerifyPut {
	@Given("Updating id using Put Method")
	public void updating_id_using_put_method() throws FileNotFoundException {
	Employees em2=new Employees();
	em2.PutMethod();
	}

	@Then("updated method Successfully")
	public void updated_method_successfully() {
	   System.out.println("updated successfully");
	}
}
