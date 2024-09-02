package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogoutPage {
	
	
	WebDriver driver;
	
	  public LogoutPage(WebDriver driver) {
			this.driver=driver;
			
		}
	  
	  private By ActmessageLogout =By.xpath("//div[@id=\"content\"]/h1");
	  public WebElement  ActLogoutMessage(){
		  return driver.findElement(ActmessageLogout);
		  
	  }
	 
	
	

}
