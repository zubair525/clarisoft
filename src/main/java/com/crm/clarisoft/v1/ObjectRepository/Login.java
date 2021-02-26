package com.crm.clarisoft.v1.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class Login {

	public Login(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "user_name")
	private WebElement username;

	@FindBy(name = "user_password")
	private WebElement pwd;

	@FindBy(id = "submitButton")
	private WebElement loginbtn;

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return pwd;
	}

	public WebElement getLoginbtn() {
		return loginbtn;
	}

	public void loginToApp(String userName, String password) {
		
		getUsername().sendKeys(userName);
		getPassword().sendKeys(password);
		getLoginbtn().click();
	}
}
