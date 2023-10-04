package com.SwagDemo.Testlayer;

import org.testng.annotations.Test;

import com.SwagDemo.pagelayer.LoginPage;
import com.SwagDemo.testBase.TestBase;

public class LoginTest extends TestBase {
	@Test
	public void logintestwithvaliinputdata() throws InterruptedException 
	{
		LoginPage login =new LoginPage();
		login.enterusername("standard_user");
		login.enterPassword("secret_sauce");
		Thread.sleep(2000);
		login.clickOnLoginButton();
	}

}
