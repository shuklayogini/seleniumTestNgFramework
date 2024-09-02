package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class BaseClass {
	public WebDriver driver;
	Properties pr ;
	public static String uniqueemailID=UniqemailAddress();
	
	
	public static   String UniqemailAddress() {
		return System.currentTimeMillis()+ "@gmail.com";
		}

	public void OpenBrowser() throws IOException {
		
		
		FileInputStream fl=new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\resources\\TestData.Properties");
	
		
		 pr =new Properties();
		pr.load(fl);
		String browserName=pr.getProperty("browser");
		if (browserName.equalsIgnoreCase("chrome")){
	  driver= new ChromeDriver();
		
	}
		else if (browserName.equalsIgnoreCase("firebox")){
			driver=new FirefoxDriver();
			
		
	}
		

 
}
	
	
	@BeforeMethod
	public void launchBrowserAndOpenURl() throws IOException {
		
		
		OpenBrowser();
		driver.get(pr.getProperty("url"));
		
		
	}
	@AfterMethod
	public void closeBrowser() throws IOException {
		// driver.quit();
	}
}