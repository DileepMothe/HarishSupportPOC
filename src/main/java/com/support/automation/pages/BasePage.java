package com.support.automation.pages;

import org.openqa.selenium.support.PageFactory;

import com.support.automation.base.Base;

public class BasePage {
	
	public BasePage() {
		PageFactory.initElements(Base.driver, this);
	}

}
