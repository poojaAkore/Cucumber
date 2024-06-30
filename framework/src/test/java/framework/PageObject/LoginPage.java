package framework.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver){
		this.ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
		
	}
	
	@FindBy(id="Email")
	WebElement UserName;
	
	@FindBy(id="Password")
	WebElement Password;
	
	@FindBy(xpath="//button[text()='Log in']")
	WebElement loginbutton;
	
	@FindBy(xpath="//input[@data-val-required='The Remember me? field is required.']")
	WebElement Checkbox;
	
	@FindBy(xpath="//h2[text()='Defaults for admin area']")
	WebElement Textmsg;
	
	@FindBy(xpath="//a[text()='Logout']")
	WebElement logout;
	
	public void EnterEmail(String email)
	{
		UserName.clear();
		UserName.sendKeys(email);
	}
	public void EnterPassword(String pass)
	{
		Password.clear();
		Password.sendKeys(pass);
	}
	public void ClickOnLoginbutton()
	{
		loginbutton.click();
	}
	public void ClickOnLogoutButton()
	{
		logout.click();
	}
	
	
	
	

}
