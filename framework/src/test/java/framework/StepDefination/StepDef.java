package framework.StepDefination;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import framework.PageObject.LoginPage;
import io.cucumber.java.en.*;

public class StepDef {
	public WebDriver driver;
	public LoginPage loginpge;
	
	
	
	@Given("User launch chrome browser")
	public void user_launch_chrome_browser() {
		driver=new ChromeDriver();
		loginpge=new LoginPage(driver);
	    
	}

	@When("User open Url {string}")
	public void user_open_url(String url) {
		driver.get(url);
	    
	}

	@When("user enter email as {string}")
	public void user_enter_email_as(String emailId) {
		loginpge.EnterEmail(emailId);
	   
	}

	@When("password as {string}")
	public void password_as(String pass) {
		loginpge.EnterPassword(pass);
	  
	}

	@When("Click on login button")
	public void click_on_login_button() {
	    loginpge.ClickOnLoginbutton();
	}

	@Then("Page Title should be {string}")
	public void page_title_should_be(String ExpTitle) {
	    String ActualTitile=driver.getTitle();
	    System.out.println(ActualTitile);
	    if(ActualTitile.equals(ExpTitle))
	    {
	    	Assert.assertTrue(true);
	    }
	    else
	    {
	    	Assert.assertFalse(false);
	    }
	}

	@When("User click on logout link")
	public void user_click_on_logout_link() {
		loginpge.ClickOnLogoutButton();
	    
	}

	@Then("close browser")
	public void close_browser() {
	   driver.close();
	   driver.quit();
	}


}
