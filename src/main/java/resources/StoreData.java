package resources;

public class StoreData {
	//Registration Data
	public static String firstName= "john";
	public static String lastName= "wick";
	public static String telephone= "0123456789";
	public static String password= "Password1234";

	public static String regExpectedText= "Your Account Has Been Created!";
	public static String ExpErrorFirstName="First Name must be between 1 and 32 characters!";
	public static String ExpErrorLastName="Last Name must be between 1 and 32 characters!";
	public static String ExpErrorEmail="E-Mail Address does not appear to be valid!";
	public static String ExpErrorTelephone="Telephone must be between 3 and 32 characters!";
	public static String ExpErrorPassword="Password must be between 4 and 20 characters!";
	public static String ExpErrorpolicy="Warning: You must agree to the Privacy Policy!";
	
	
	// Login Data
	public static String expected= "https://naveenautomationlabs.com/opencart/index.php?route=account/account";
	public static String ExpLogoutmessage="Account Logout";
	public static String EmailNegative="abc@anc.com";
	public static String ExpectedMessage="Warning: No match for E-Mail Address and/or Password.";
	
}
