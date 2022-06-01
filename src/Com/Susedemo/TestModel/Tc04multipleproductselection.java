package Com.Susedemo.TestModel;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Com.sousedemo.PomModel.HomepagePomClass;
import Com.sousedemo.PomModel.LoginpagePomClass;

public class Tc04multipleproductselection extends TestBaseClass
{
   @Test
	public  void multipleproduct() 
	{
		
//all product select.
HomepagePomClass hp = new HomepagePomClass(driver);
hp.addAllProduct();
System.out.println("all products are added to cart");
		
//validation
System.out.println("apply the validation");

       String actualResult = hp.getTextFromCartButton();
       String expctedResult = "6";

if(expctedResult.equals(actualResult))
       {
	System.out.println("test case is passed");
       }
else
       {
	System.out.println("Test case is failed");
       }

driver.quit();
System.out.println("end of program");


    hp.clickMenuButton();
   System.out.println("Clicked on menu button");

    hp.clickLogOutButton();
     System.out.println("Clicked on logout button");




	}


}
