package testcases;

import java.io.IOException;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pageObjectModel.AccountPageObject;
import pageObjectModel.HomePage;
import pageObjectModel.LoginPage;
import pageObjectModel.LogoutPage;
import resources.BaseClass;
import resources.CommonMethods;
import resources.StoreData;

public class VerifyLogin extends BaseClass {
	@Test
	public void logintestcase() throws IOException{

		HomePage hp=new HomePage(driver);
		hp.clickOnMyAccount().click();
		hp.login().click();
		
		LoginPage lp=new LoginPage(driver);
		lp.enterEmail().sendKeys(uniqueemailID);
		lp.enterPassword().sendKeys(StoreData.password);
		lp.clickOnSubmit().click();
		
       
		String actual = driver.getCurrentUrl();
		CommonMethods.handleAssertion(actual, StoreData.expected);
	
		
		
		AccountPageObject ap=new AccountPageObject(driver) ;
		ap.ClickOnMyAccount().click();
		ap.clickOnlogout().click();
		LogoutPage lO=new LogoutPage(driver);
		
		String ActLogoutMsg=lO.ActLogoutMessage().getText();
		CommonMethods.handleAssertion(ActLogoutMsg,StoreData.ExpLogoutmessage);

		
		
		
	}
	
	
	
	
	@Test(enabled=false)
	public void loginnegativetestcase() throws IOException{

		
		HomePage hp=new HomePage(driver);
		
		hp.clickOnMyAccount().click();
		hp.login().click();
		
		LoginPage lp=new LoginPage(driver);
		lp.enterEmail().sendKeys(StoreData.EmailNegative);
		lp.enterPassword().sendKeys(StoreData.password);
		lp.clickOnSubmit().click();
		String ActualMessage=lp.ActuallogonerrorMessage().getText();
		
		SoftAssert sa= new SoftAssert();
		sa.assertEquals(ActualMessage,StoreData.ExpectedMessage );
		sa.assertAll();
		
	}
	
	
	
}
