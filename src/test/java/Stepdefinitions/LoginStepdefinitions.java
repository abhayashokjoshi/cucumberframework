package Stepdefinitions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.HeaderPage;
import pages.loginPage;

public class LoginStepdefinitions extends Basedefinitions {
	
	//public WebDriver driver;
	
	//public loginPage lp =new loginPage(driver);
	//public HeaderPage hp = new HeaderPage(driver);
	
	
	@Given("user should be on login page")
	public void user_should_be_on_login_page() {
		System.out.println("user should be on login page");
		lauchApp();
	   
	}


	

	@When("user enters valid id and password")
	public void user_enters_valid_id_andpassword() throws Exception {
		System.out.println("user enters valid id and password");
		loginPage lp =new loginPage(driver);
		lp.EnterUseridPwd("admin", "admin");
	}	
		@When("^user enters valid id \"([^\"]*)\" and password \"([^\"]*)\"$")
		public void user_enters_valid_id_and_password(String userid, String pwd) throws Throwable {
			System.out.println("user enters valid id and password");
			loginPage lp =new loginPage(driver);
			lp.EnterUseridPwd(userid,pwd);
		}	
	   
	
	@When("click on login button")
	public void click_on_login_button() throws Exception {
		System.out.println("click on login button");
		loginPage lp =new loginPage(driver);
		lp.Clicklogin();
	    
	}
	@Then("user should navigate to home page")
	public void user_should_navigate_to_home_page() {
		System.out.println("user should navigate to home page");
	    
	}
	@Then("click on logout link")
	public void click_on_logout_link() {
		System.out.println("click on logout link");
		HeaderPage hp = new HeaderPage(driver);
		hp.clickOnLogout();
	    
	}
	
	@When("^user enters valid userid \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void user_enters_valid_userid_and_password(String arg1, String arg2, DataTable dt) throws Throwable {
		List<List<String>> data = dt.raw();
		loginPage lp =new loginPage(driver);
		lp.EnterUseridPwd(data.get(1).get(0), data.get(1).get(1));
		
	}
	
	
	@Given("^Close browser$")
	public void close_browser() throws Throwable {
	    driver.quit();
	}
	
	@Then("^user should navigate to login page with error message \"([^\"]*)\"$")
	public void user_should_navigate_to_login_page_with_error_message(String msg) throws Throwable {
		loginPage lp =new loginPage(driver);
		lp.verifyErrorMsg();
	}

}
