package com.support.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{
	

@FindBy(id="email")
public WebElement EmailTextBox;

@FindBy(id="passwd")
public WebElement PasswordTextBox;

@FindBy(id="SubmitLogin")
public WebElement SubmitBtn;


}
