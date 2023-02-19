package TestCases;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PageObjectModel.LoginPageObject;
import Resource.baseClass;
import Resource.constants;

public class VerifyLoginPage extends baseClass {

	
	
		 
		 @Test
		 public void login() throws IOException {
		  
		  driverInitilize();
		  //This driver have scope
		  driver.get("https://login.salesforce.com/");
		  
		  LoginPageObject obj=new LoginPageObject(driver);
		  
		  obj.enterUsername().sendKeys("rahul");
		  
		  obj.enterPassword().sendKeys("test");
		  
		  obj.clickOnLogin().click();
		  
		  
		  SoftAssert a=new SoftAssert();
		  
		  
		 
		  
		    
		 }
		 
		 @DataProvider
		 public Object[][] testData() 
		 {
		  Object[][] data=new Object[4][2];
		  data[0][0]=constants.username1;
		  data[0][1]=constants.password1;
		  data[1][0]=constants.username2;
		  data[1][1]=constants.password2;
		
		  return data;
		 }

}

