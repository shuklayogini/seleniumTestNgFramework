package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	WebDriver driver;
	
	  public LoginPage(WebDriver driver) {
			this.driver=driver;
			
		}
	
	  private By email =By.xpath("//input[@name='email']");
	  private By password =By.xpath("//input[@name='password']");
	  private By submit =By.xpath("//input[@type='submit']");
	  
	  public WebElement  enterEmail() {
		  return driver.findElement(email);
		  
	  }
	  public WebElement  enterPassword() {
		  return driver.findElement(password);
		  
	  }
	  public WebElement  clickOnSubmit() {
		  return driver.findElement(submit);
		  
	  }
	  
		private By errormessage=By.xpath("//div[@class='alert alert-danger alert-dismissible']");
	public WebElement ActuallogonerrorMessage() {
		 

		return driver.findElement(errormessage);
	}
	
	
}
