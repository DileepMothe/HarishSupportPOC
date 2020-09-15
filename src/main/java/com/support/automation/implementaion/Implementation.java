package com.support.automation.implementaion;

import com.support.automation.base.Base;
import com.support.automation.pages.HomePage;
import com.support.automation.pages.LoginPage;
import com.support.automation.utils.Elements;

import junit.framework.Assert;

public class Implementation extends Elements{
	
	LoginPage loginPo=new LoginPage();
	HomePage homePo=new HomePage();
	public void doLogin(){
		SendInput(loginPo.EmailTextBox, Base.reader.getUserName(), "UserName");
		SendInput(loginPo.PasswordTextBox, Base.reader.getPassword(), "Password");
		clickObject(loginPo.SubmitBtn, "SubmitButton");
	}
	
	@SuppressWarnings("deprecation")
	public void doLogOut(){
		clickObject(homePo.signOutLink, "signOutLink");
	}

	
	@SuppressWarnings("deprecation")
	public void verifyAccountHolderNameInHomePage(){
		Assert.assertEquals("Dileep Test", homePo.AccountHolderName.getText().trim());
	}
}
