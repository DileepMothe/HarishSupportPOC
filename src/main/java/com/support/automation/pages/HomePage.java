package com.support.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
	
	
	@FindBy(xpath="//*[@class='logout']")
	public WebElement signOutLink;
	
	@FindBy(xpath="//*[@class='account']/span")
	public WebElement AccountHolderName;
	
	

}
