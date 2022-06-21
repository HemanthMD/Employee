package testStep;

import java.io.FileNotFoundException;

import Methods.Employees;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class VerifyPost {
	@Given("Posting a new emp id in the url")
	public void posting_a_new_emp_id_in_the_url() throws FileNotFoundException {
	  Employees em1=new Employees();
	  em1.PostMethod();
	}

	@Then("executed Successfully post method")
	public void executed_successfully_post_method() {
	   System.out.println("updated successfully");
	}

}
