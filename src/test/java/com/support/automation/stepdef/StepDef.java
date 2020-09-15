package com.support.automation.stepdef;

import com.support.automation.base.Base;
import com.support.automation.implementaion.Implementation;
import com.support.automation.utils.Elements;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

public class StepDef{
	Implementation impl=new Implementation();
	Elements element=new Elements();
	
	@Given("^I navigate to Application$")
	public void i_NavigateToApplication() throws Throwable {
		Base.navigateToApplicationUrl();
	}
	
	@And("^I login into the Application$")
	public void doLoginToApplication(){
		impl.doLogin();
	}
	
	@And("^I verify UserName in HomePage$")
	public void verifyAccountHolderName() throws InterruptedException{
		Thread.sleep(5000);
		impl.verifyAccountHolderNameInHomePage();
	}
	
	 
	
	@And("^I click on signout$")
	public void verifyElementInHomePage() throws InterruptedException{
		Thread.sleep(1000);
		impl.doLogOut();
	}
	
	
	
	
	
	

}
