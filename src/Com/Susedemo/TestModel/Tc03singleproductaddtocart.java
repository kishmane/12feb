package Com.Susedemo.TestModel;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Com.sousedemo.PomModel.HomepagePomClass;
import Com.sousedemo.PomModel.LoginpagePomClass;

public class Tc03singleproductaddtocart extends TestBaseClass
{


	@Test
	public  void sinlgeproductadd() 
	{
		
HomepagePomClass hp = new HomepagePomClass(driver);

//single product
hp.clickBagButton();
System.out.println("product is added to cart");
		
System.out.println("Apply the validation");

        String actualResult = hp.getTextFromCartButton();

        String expectedResult ="1";

if(expectedResult.equals(actualResult))
        {
	System.out.println("Test case is passed");
        }
else
        {
	System.out.println("Test case is failed");
        }

driver.quit();
System.out.println("End of program");


  hp.clickMenuButton();
   System.out.println("Clicked on menu button");

   hp.clickLogOutButton();
   System.out.println("Clicked on logout button");


}


}
