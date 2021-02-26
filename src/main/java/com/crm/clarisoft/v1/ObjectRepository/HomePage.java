package com.crm.clarisoft.v1.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	HomePage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[text()='Products']")
	private WebElement produt;

	public WebElement getProdut() {
		return produt;
	}
	
	
	
	
}
