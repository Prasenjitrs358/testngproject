package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Resource.baseClass;





public class signuPageObject extends baseClass
{
	
	public WebDriver driver;
	public signuPageObject spo;
	 
	 private By firstName=By.xpath("//input[@name='UserFirstName']");
	 private By employee=By.xpath("//select[@name='CompanyEmployees']");
	 
	 
	 
	 public signuPageObject(WebDriver driver2) 
	 {
	  
	  this.driver=driver2;
	  
	  signuPageObject spo=new signuPageObject(driver2);

	 }

	 public WebElement enterFirstname() 
	 {
	  
	  return driver.findElement(firstName);
	 }
	 
	  public WebElement selectEmployee() 
	   {
	  
	  return driver.findElement(employee);
	   }
	 
}
