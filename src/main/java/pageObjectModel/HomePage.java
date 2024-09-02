package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	public WebDriver driver;
	
private By myAccount = By.xpath("//a[@title='My Account']");
  private By register= By.xpath("//a[text()='Register']");
  private By login=By.xpath("//a[text()='Login']");
  
  
  
  public HomePage(WebDriver driver) {
	this.driver=driver;
	
}
public WebElement  clickOnMyAccount() {
	  return driver.findElement(myAccount);
	  
  }
  public WebElement  clickOnRegister() {
	  return driver.findElement(register);
	  
  }
  public WebElement login() {
	  return driver.findElement(login);
  }
}
