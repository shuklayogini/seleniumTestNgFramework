package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegistrationPage {
	WebDriver driver;

	
	private By FirstName = By.xpath("//input[@name='firstname']");
	  private By LastName= By.xpath("//input[@name='lastname']");
	  private By EMail= By.xpath("//input[@name='email']");
	  private By telephone= By.xpath("//input[@name='telephone']");  
	  private By Password= By.xpath("//input[@name='password']");
	  private By ConfirmPassword= By.xpath("//input[@name='confirm']");
	  private By SubscribeNo=By.xpath("(//input[@name='newsletter'])[2]");
	  private By Policy=By.xpath("//input[@name='agree']");
	  private By Continue= By.xpath("//input[@type='submit']");;
	 private By ActualAccountCreatedMessage=By.xpath("//div[@id=\"content\"]/h1");
	 
	  
	  
	  public RegistrationPage(WebDriver driver) {
		this.driver=driver;
		
	}
	public WebElement  enterFirstName() {
		  return driver.findElement(FirstName);
		  
	  }
	  public WebElement  enterLastName() {
		  return driver.findElement(LastName);
		  }
	  public WebElement  enterEmail() {
		  return driver.findElement(EMail);
		  }
	  public WebElement  enterTelephone() {
		  return driver.findElement(telephone);
		  }
	  public WebElement  enterPassword() {
		  return driver.findElement(Password);
		  }
	  public WebElement  enterConfirmPassword() {
		  return driver.findElement(ConfirmPassword);
		  }
	  public WebElement  enterSubscribeNo() {
		  return driver.findElement(SubscribeNo);
		  }
	  public WebElement  SelectPolicyCheckbox() {
		  return driver.findElement(Policy);
		  }
	  public WebElement  ClickOnContinue() {
		  return driver.findElement(Continue);
		  }
	public WebElement ActualAccountCreatedMessage() {
		return driver.findElement(ActualAccountCreatedMessage);
	}
		
	//-----Negative Test cases
	
	private By ActErrorFirstName= By.xpath("//div[text()='First Name must be between 1 and 32 characters!']");
	private By ActErrorLastName= By.xpath("//div[text()='Last Name must be between 1 and 32 characters!']");
	private By ActErrorEmail= By.xpath("//div[text()='E-Mail Address does not appear to be valid!']");
	private By ActErrorTelephone= By.xpath("//div[text()='Telephone must be between 3 and 32 characters!']");
	private By ActErrorPassword= By.xpath("//div[text()='Password must be between 4 and 20 characters!']");
	private By ActErrorPolicy= By.xpath("//div[text()=' Warning: You must agree to the Privacy Policy!']");
	
	 public WebElement  ActualErrorMessageFirstName() {
		  return driver.findElement(ActErrorFirstName);
		  }
	 public WebElement  ActualErrorMessageLastName() {
		  return driver.findElement(ActErrorLastName);
		  }
	 public WebElement  ActualErrorMessageEmail() {
		  return driver.findElement(ActErrorEmail);
		  }
	 public WebElement  ActualErrorMessageTelephone() {
		  return driver.findElement(ActErrorTelephone);
		  }
	 public WebElement  ActualErrorMessagePassword() {
		  return driver.findElement(ActErrorPassword);
		  }
	 public WebElement  ActualErrorMessagePolicy() {
		  return driver.findElement(ActErrorPolicy);
		  }
	  

}
