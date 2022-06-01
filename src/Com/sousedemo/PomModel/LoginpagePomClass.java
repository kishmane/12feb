package Com.sousedemo.PomModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginpagePomClass
{
	private WebDriver driver;
	private Actions act;
	@FindBy(xpath="//input[@id='user-name']")
	private  WebElement username;
	
	
	//actions on element -method
	public void sendUsername()
	{
		username.sendKeys("standard_user");
	}
	
	@FindBy(xpath="//input[@id='password']")
	private WebElement password;
	
public void sendPassword()
     {
	password.sendKeys("secret_sauce");
     }
	
	
	
@FindBy(xpath="//input[@id='login-button']")
	private WebElement loginButton;
	
	
	public void clickLoginButton()
	{
		loginButton.click();
	}
	
	public LoginpagePomClass(WebDriver driver)
	{
      this.driver =driver; 
      PageFactory.initElements(driver,this);
		act=new Actions(driver);
	}
}
