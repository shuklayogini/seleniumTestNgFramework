package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AccountPageObject {
	public WebDriver driver;
	
	
	private By MyAccountafterLogin = By.xpath("//a[@class='dropdown-toggle']");
	private By logOut = By.xpath("//a[text()=\"Logout\"]");
	  public AccountPageObject(WebDriver driver) {
			this.driver=driver;
			
		}
		public WebElement  ClickOnMyAccount(){
			  return driver.findElement(MyAccountafterLogin);
			  
		  }
  
	  
		public WebElement  clickOnlogout(){
			  return driver.findElement(logOut);
			  
		  }

}
