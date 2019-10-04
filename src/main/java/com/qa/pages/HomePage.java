package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.TestBase;

public class HomePage extends TestBase {
	
	@FindBy(xpath="//*[@id=\"top-header-menu\"]/div[1]")
	WebElement email;
	
//	@FindBy(name="password")
//	WebElement password;
	
//	@FindBy(xpath="//*[@id=\"ui\"]/div/div/form/div/div[3]")
//	WebElement loginbutton;
	

   // Initialise all the page objects
   public HomePage()
   {
	   PageFactory.initElements(driver, this);
   }
   
   public String verifyhomepagetitle()
	{
		return driver.getTitle();
	}
	
  
   
   
	
	
	
	
	
	
	
	
	

}
