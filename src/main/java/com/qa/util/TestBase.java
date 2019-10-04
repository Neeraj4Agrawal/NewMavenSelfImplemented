package com.qa.util;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	
	
	public TestBase(){
		
		try {
			prop= new Properties();
			FileInputStream fis = new FileInputStream("/home/cgt_jod_lin_neeraja/workspace/TestMavenProjects/src/main/java/com/qa/config/config.properties");
			prop.load(fis);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.getMessage();
		}
		
	}
  
	public static void initialisation()
	{
		
		String browsesername = prop.getProperty("browser");
		
		if(browsesername.equals("chrome"));
		{
			System.setProperty("webdriver.chome.driver","/home/cgt_jod_lin_neeraja/workspace/TestMavenProjects/chromedriver");
			driver=new ChromeDriver();
		}
		
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_TIME_OUT,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT,TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
