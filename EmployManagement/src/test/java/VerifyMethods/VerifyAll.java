package VerifyMethods;

import java.io.FileNotFoundException;

import org.testng.annotations.Test;

import Methods.Employees;

public class VerifyAll extends Employees{
	@Test(priority = 3)
public void TestGetMeth() {
	Employees emp=new Employees();
	emp.GetMethod();
}
	@Test(priority =1 )
	public void TestPostMeth() throws FileNotFoundException {
		Employees emp=new Employees();
		emp.PostMethod();
	}
	@Test(priority = 4)
	public void TestSingleid() {
		Employees emp=new Employees();
		emp.GetSingleid();
	}
	@Test(priority = 2)
	public void TestPutMeth() throws FileNotFoundException {
		Employees emp=new Employees();
		emp.PutMethod();
	}
	@Test(enabled = false)
	public void TestDelete() {
		Employees emp=new Employees();
		emp.DeleteMethod();
	}
}
