package Methods;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import io.restassured.RestAssured;

public class Employees {
		
		public void GetMethod()
		{
		RestAssured.given().baseUri("http://localhost:8081/employees")
		.when().log().all().get().then().log().all().assertThat().statusCode(200); 
		}
		public void GetSingleid()
		{
		RestAssured.given().baseUri("http://localhost:8081/employee")
		.when().log().all().get("/103").then().log().all().assertThat().statusCode(200); 
		}
		public void PostMethod() throws FileNotFoundException
		{
		RestAssured.given().baseUri("http://localhost:8081")
		.body(getFileContent("D:\\users\\workspace\\EmployManagement\\src\\test\\resources\\putMethod"))
		.header("Content-Type","application/json").header("Accept","application/json").when().log().all()
		.post("/employees").then().log().all();
		}
		
		public void PutMethod() throws FileNotFoundException
		{
		RestAssured.given().baseUri("http://localhost:8081")
		.body(getFileContent("D:\\users\\workspace\\EmployManagement\\src\\test\\resources\\putMethod")).header("Authorization","Basic YWRtaW46cGFzc3dvcmQxMjM=] ")
		.header("Accept","application/json").header("Content-Type","application/json")
		.when().log().all().put("/employee/104").then().log().all();
		}
		public static String getFileContent(String filepath) throws FileNotFoundException 
		{
		 File file = new File(filepath);
		 Scanner sc =new Scanner(file);
		 sc.useDelimiter("\\z");
         return sc.next();
		}

		public void DeleteMethod()
		{
		RestAssured.given().baseUri("http://localhost:8081")
		.headers("Authorization","Basic YWRtaW46cGFzc3dvcmQxMjM=").when().log().all().delete("/employee/109").then().log().all().assertThat().statusCode(204);
		}
}

