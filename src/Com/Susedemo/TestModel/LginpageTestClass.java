package Com.Susedemo.TestModel;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Com.sousedemo.PomModel.HomepagePomClass;
import Com.sousedemo.PomModel.LoginpagePomClass;

public class LginpageTestClass extends TestBaseClass
{
	
		
	
	
	@Test
	public void logifunctionality()
	{
	 
	
       String expectedTitle = "Swag Labs";
       String actualTitle = driver.getTitle();

System.out.println("Verify the test case");

if(expectedTitle.equals(actualTitle))
       {
	System.out.println("Test case is passed");
       }
else
       {
	System.out.println("Test case is failed");
       }

        //close the browser
   driver.quit();
   System.out.println("End of program");

   //logout


HomepagePomClass hp = new HomepagePomClass(driver);
hp.clickMenuButton();
System.out.println("Clicked on menu button");

hp.clickLogOutButton();
System.out.println("Clicked on logout button");

	}	
	



}
