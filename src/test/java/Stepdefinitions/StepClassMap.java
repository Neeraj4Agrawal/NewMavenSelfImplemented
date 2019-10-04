package Stepdefinitions;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class StepClassMap {
	
	WebDriver driver;	
	
		 
	@Given("^Initialize resources in the beginning of each scenario for Login datatablemap$")
	public void Initialize_Resources() throws IOException, InterruptedException {
		
		
		 System.setProperty("webdriver.chrome.driver","/home/cgt_jod_lin_neeraja/workspace/TestMavenProjects/chromedriver");
		 driver = new ChromeDriver();
		 driver.get("https://ui.freecrm.com/");
	}
	
	
	@Then("^data table map user enters username and password$")
public void user_enters_username_and_password(DataTable credentials) {
		for (Map<String, String> data : credentials.asMaps(String.class, String.class)) {

			driver.findElement(By.name("email")).sendKeys(data.get("username"));
			driver.findElement(By.name("password")).sendKeys(data.get("password"));

		}

	}	
	
/*	@Then("^data table map user enters username and password$")
	public void user_enters_username_and_password(DataTable credentials)
	{
	for(Map<String,String> data : credentials.asMaps(String.class,String.class));{
		
	driver.findElement(By.name("email")).sendKeys(data.get("username"));
	driver.findElement(By.name("password")).sendKeys(data.get("password"));
	
	}}
*/
	@Then("^data tabel map Close the browser$")
	public void close_the_browser() {
		driver.quit();
	}

}
