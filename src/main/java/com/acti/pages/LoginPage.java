package com.acti.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.acti.base.DriverScript;

/*
 * Tester Name:A
 * Date Created : 08/04/2020
 * Approved By : Bijon
 */

public class LoginPage extends DriverScript {
	
	@FindBy(id="username") WebElement usernameTBox;
	@FindBy(name="pwd") WebElement passwordTBox;
	@FindBy(id="loginButton") WebElement loginButton;
	@FindBy(xpath="//div[@ class='atLogoImg']") WebElement actiLogo;
	
	//*********************************************************************************
	public LoginPage()
	{
	PageFactory.initElements(driver, this);		

	}
	
	//*************************************************************************************
	public void validateLoginFucntion()
	{
	usernameTBox.sendKeys("admin");
	passwordTBox.sendKeys("manager");
	loginButton.click();
	
	}
	
	public boolean verifyActiLogo()
	{
		return actiLogo.isDisplayed();
	}
	public String verifyLoginPageTitle()
	{
		return driver.getTitle();
	
	}

  }
