package com.SwagDemo.pagelayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	private  WebDriver driver;
	public void Loginpage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	//----------- Obj repo --------------------
	private By username_txtbox = By.xpath("//input[@id=\"user-name\"]");
	private By password_txtbox = By.xpath("//input[@type=\"password\"]");
	private By login_btn = By.xpath("//input[@id=\"login-button\"]");
	
	//--------- Action methods ----------------

	public void enterusername(String username)
	{
		driver.findElement(username_txtbox).sendKeys(username);
	}
	
	public void enterPassword(String password)
	{
		driver.findElement(password_txtbox).sendKeys(password);
	}
	
	public void clickOnLoginButton()
	{
		driver.findElement(login_btn).click();
	}
	
}

	


