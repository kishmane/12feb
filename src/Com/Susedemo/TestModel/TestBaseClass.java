package Com.Susedemo.TestModel;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import Com.sousedemo.PomModel.LoginpagePomClass;

public class TestBaseClass 
{
 
     WebDriver driver;
	
	@BeforeMethod
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Rahul\\Downloads\\zipfiles\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		System.out.println("browser open");
		
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		System.out.println("URL open");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
        //login 
LoginpagePomClass lp = new LoginpagePomClass(driver);

lp.sendUsername();       //username
System.out.println("Enter the username");

lp.sendPassword();       //password
System.out.println("Enter the password");

lp.clickLoginButton();   //login click
System.out.println("CLick on login button");
   }
	
	 @AfterMethod
	public void tearDown() throws IOException
	   {
	        //logout
	driver.quit();
	System.out.println("End of program");	
		}

}


	
	
	
