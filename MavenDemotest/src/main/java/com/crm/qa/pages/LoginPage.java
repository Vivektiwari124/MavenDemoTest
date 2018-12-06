package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.crm.qa.Base.TestBase;

public class LoginPage extends TestBase{
	
	//Page Fectory
	@FindBy(name="username")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement loginbtn;
	
	@FindBy(xpath="//ul/li/a[@href='https://www.freecrm.com/register/']")
	WebElement signup;
	

}
