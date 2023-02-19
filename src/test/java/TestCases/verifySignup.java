package TestCases;

import java.io.IOException;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import PageObjectModel.LoginPageObject;
import PageObjectModel.signuPageObject;
import Resource.baseClass;
import Resource.constants;

public class verifySignup extends baseClass
{

	
	 @Test
	 public void signup() throws IOException, InterruptedException 
	 {
	  
	  LoginPageObject lpo=new LoginPageObject(driver);
	  
	  lpo.clickOntryForFreee().click();
	  
	  signuPageObject spo=new signuPageObject(driver);
	  
	  Thread.sleep(5000);
	  
	  spo.enterFirstname().sendKeys(constants.firstname);
	 
	  Select s=new Select(spo.selectEmployee());
	  s.selectByIndex(1);
	  
	 }
}
