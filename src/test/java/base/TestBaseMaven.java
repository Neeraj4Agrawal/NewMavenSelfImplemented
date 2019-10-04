package base;

import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.qa.util.TestUtil;

import utilities.ReadResources;





public class TestBaseMaven {
	public static WebDriver driver;
	private static ReadResources readResources;
	private static Map<String, String> readLoginData;

	
	public  TestBaseMaven()
	{
	 readResources = new ReadResources();
	}
	
	
	public static ReadResources getReadResources() {
		return readResources;
	}

	public static void main(String[]args)
	{
		TestBaseMaven readdatafromxml= new TestBaseMaven();
		readLoginData=	TestBaseMaven.getReadResources().getValuesFromXml("LoginPage.xml","loginObjectRepository");
		System.out.println(readLoginData.get("logo"));
		
	}
	
	public void initialisation()
	{
		TestBaseMaven readdatafromxml= new TestBaseMaven();
		readLoginData=	TestBaseMaven.getReadResources().getValuesFromXml("LoginPage.xml","loginObjectRepository");
		String browsesername =readLoginData.get("browser");
		
		if(browsesername.equals("chrome"));
		{
			System.setProperty("webdriver.chome.driver","/home/cgt_jod_lin_neeraja/workspace/TestMavenProjects/chromedriver");
			driver=new ChromeDriver();
		}
		
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_TIME_OUT,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT,TimeUnit.SECONDS);
		driver.get(readLoginData.get("url"));
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
