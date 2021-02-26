package com.crm.clarisoft.v1.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout {
	
	Logout(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//td[contains(@onmouseover,'ondemand_sub')]")
	private WebElement mouseover;
	
	@FindBy(xpath="//a[text()='Sign Out']")
	private WebElement logout;

	public WebElement getMouseover() {
		return mouseover;
	}

	public WebElement getLogout() {
		return logout;
	}
	
	
}
