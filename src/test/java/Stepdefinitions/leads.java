package Stepdefinitions;

import org.openqa.selenium.By;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pages.CreateLeadPage;
import pages.HeaderPage;
import pages.loginPage;

public class leads extends Basedefinitions {
	//public loginPage lp =new loginPage(driver);
	//public HeaderPage hp = new HeaderPage(driver);
	public CreateLeadPage cp =new CreateLeadPage(driver);
	
	@Given("^user click on new lead$")
	public void user_click_on_new_lead() throws Throwable {
		HeaderPage hp = new HeaderPage(driver);
		hp.clickOnCreateLead();
	  
	}
	
	@Given("^user click on leads$")
	public void user_click_on_lead() throws Throwable {
		HeaderPage hp = new HeaderPage(driver);
		hp.clickOnLeads();
	  
	}

	@Then("^user enters fname and lname and click on save button$")
	public void user_enters_fname_and_lname_and_click_on_save_button() throws Throwable {
		CreateLeadPage cp =new CreateLeadPage(driver);
		cp.verifyCreateLeadwithMandatoryField("Modi", "BJP");
	}

	@Then("^user should navigate lead page$")
	public void user_should_navigate_lead_page() throws Throwable {
		System.out.println("Lead validated");
	   
	}

	@Then("^select lead checkbok$")
	public void select_lead_checkbox() throws Throwable {
		driver.findElements(By.name("selected_id")).get(1).click();
		System.out.println("Lead validated");
	   
	}

}
