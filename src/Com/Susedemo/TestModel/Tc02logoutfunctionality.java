package Com.Susedemo.TestModel;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Com.sousedemo.PomModel.HomepagePomClass;
import Com.sousedemo.PomModel.LoginpagePomClass;

public class Tc02logoutfunctionality extends TestBaseClass
{
	@Test
	public  void logoutfunctionality() 
	{
		

        //homePage
HomepagePomClass hp = new HomepagePomClass(driver);
hp.clickMenuButton();
System.out.println("Clicked on menu button");

hp.clickLogOutButton();
System.out.println("Clicked on logout button");

System.out.println("apply validation");

        String expectedUrl = "https://www.saucedemo.com/";
        String actualUrl = driver.getCurrentUrl();

if(expectedUrl.equals(actualUrl))
        {
	System.out.println("test case is passed");
        }
else
        {
	System.out.println("test case if failed");
        }

  //browser is close
  driver.quit();
    System.out.println("Browser is closed");
	}



}
