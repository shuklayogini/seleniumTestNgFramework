package testcases;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pageObjectModel.HomePage;
import pageObjectModel.RegistrationPage;
import resources.BaseClass;
import resources.StoreData;

public class VerifyRegistration extends BaseClass {
	
	
@Test

public void registration() throws IOException {


	
	HomePage hp=new HomePage(driver);
	
	hp.clickOnMyAccount().click();
	hp.clickOnRegister().click();
	
	RegistrationPage rp=new RegistrationPage(driver);
	rp.enterFirstName().sendKeys(StoreData.firstName);
	rp.enterLastName().sendKeys(StoreData.lastName);
	rp.enterEmail().sendKeys(uniqueemailID);
	rp.enterTelephone().sendKeys(StoreData.telephone);
	rp.enterPassword().sendKeys(StoreData.password);
	rp.enterConfirmPassword().sendKeys(StoreData.password);
	rp.SelectPolicyCheckbox().click();
	rp.enterSubscribeNo().click();	
	rp.ClickOnContinue().click();
	String ActualMessage=rp.ActualAccountCreatedMessage().getText();
	String ExpectedMessage=StoreData.regExpectedText;
	SoftAssert sa= new SoftAssert();
	sa.assertEquals(ActualMessage,ExpectedMessage );
	sa.assertAll();
	

	
	
	
	
	
}
@Test(enabled=false)
public void negativeTestcase() throws IOException{

	
	HomePage hp=new HomePage(driver);
	
	hp.clickOnMyAccount().click();
	hp.clickOnRegister().click();
	
	
	RegistrationPage rp=new RegistrationPage(driver);
	rp.ClickOnContinue().click();
	SoftAssert sa= new SoftAssert();
	
	String ActualErrorFirstName=rp.ActualErrorMessageFirstName().getText();
	sa.assertEquals(ActualErrorFirstName,StoreData.ExpErrorFirstName );
	
	
	String ActualErrorLastName=rp.ActualErrorMessageLastName().getText();
	sa.assertEquals(ActualErrorLastName,StoreData.ExpErrorLastName );
	
	
	String ActualErrorEmail=rp.ActualErrorMessageEmail().getText();
	sa.assertEquals(ActualErrorEmail,StoreData.ExpErrorEmail );
	

	String ActualErrorTelephone=rp.ActualErrorMessageTelephone().getText();
	sa.assertEquals(ActualErrorTelephone,StoreData.ExpErrorTelephone );
	

	String ActualErrorPassword=rp.ActualErrorMessagePassword().getText();
	sa.assertEquals(ActualErrorPassword,StoreData.ExpErrorPassword );
	
	
	String ActualErrorPolicy=rp.ActualErrorMessagePolicy().getText();
	sa.assertEquals(ActualErrorPolicy,StoreData.ExpErrorpolicy );
	
	sa.assertAll();
	
	
	
	
}




}
