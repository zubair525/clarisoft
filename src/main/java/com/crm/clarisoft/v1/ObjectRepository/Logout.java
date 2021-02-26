package com.crm.clarisoft.v1.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.clarisoft.v1.genericLib.WebDriverUtilities;

public class Logout {
	
	public Logout(WebDriver driver){
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
	
	public void logoutFromApp(WebDriver driver) {
		WebDriverUtilities wutil=new WebDriverUtilities();
		wutil.mouseOverToElement(driver, getMouseover());
		getLogout().click();
	}
}
