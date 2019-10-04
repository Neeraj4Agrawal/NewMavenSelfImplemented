package com.qa.stepdefinitions;

import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.util.TestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class HomePageSteps extends TestBase{
//	LoginPage loginpage;
	HomePage homepage= new HomePage();
	
	
	
	
	@Given("^User open the browser$")
	public void user_open_the_browser() throws Throwable {
	  TestBase.initialisation();

	}

	@Then("^User enters username and password and click on login button$")
	public void user_is_on_Login_page() throws Throwable {
		LoginPage loginpage=  new LoginPage();
	   loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
	}

	@Then("^User verify the home page title$")
	public void user_enters_username_and_password() throws Throwable {
	String homepagetitle =    homepage.verifyhomepagetitle();
	System.out.print("Home page title is "+  homepagetitle);
	}


	
	
	
	
	

}
