package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.TestBase;

public class LoginPage extends TestBase{
	
	
	
    //login page should extends the Test Base class:
             //Page factories
	@FindBy(name="email")
	WebElement email;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//*[@id=\"ui\"]/div/div/form/div/div[3]")
	WebElement loginbutton;
	
	
	
	

   // Initialise all the page objects
   public LoginPage()
   {
	   PageFactory.initElements(driver, this);
   }
   
   
   public HomePage login(String un , String pw) {
	   email.sendKeys(un);  
	   password.sendKeys(pw);
	   loginbutton.click();
	   return new HomePage();    //it will return home page class objects 
   }
   
   
   
   
   

}