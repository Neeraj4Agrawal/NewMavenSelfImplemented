package Stepdefinitions;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;



import base.TestBaseMaven;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utilities.ReadResources;

public class LoginSteps {
	
	


	TestBaseMaven tbm = new TestBaseMaven();
    WebDriver driver;	
    private Map<String, String> loginPageObjectRepo;
//ReadResources  loginPageObjectRepo1 =  new ReadResources();
@Given("^Initialize resources in the beginning of each scenario for Login$")
public void Initialize_Resources() throws IOException, InterruptedException {
	tbm.initialisation();
	loginPageObjectRepo = tbm.getReadResources().getValuesFromXml("LoginPage.xml", "loginObjectRepository");
//	tbm.initialisation();
//	 System.setProperty("webdriver.chrome.driver","/home/cgt_jod_lin_neeraja/workspace/TestMavenProjects/chromedriver");
// driver = new ChromeDriver();
	// driver.get("https://ui.freecrm.com/");
}

@Then("^user enters \"(.*)\" and \"(.*)\"$")
public void user_enters_username_and_password(String username, String password){
driver.findElement(By.xpath(loginPageObjectRepo.get("loginEmail"))).sendKeys(username);
driver.findElement(By.xpath(loginPageObjectRepo.get("loginPassword"))).sendKeys(password);
}



/*
@Then("^user enters username and password$")
public void user_enters_username_and_password(DataTable credentials){
	List<List<String>> data = credentials.raw();
driver.findElement(By.name("email")).sendKeys(data.get(0).get(0));
driver.findElement(By.name("password")).sendKeys(data.get(0).get(1));
}
*/
@Then("^Close the browser$")
public void close_the_browser() {
	driver.quit();
}









}
