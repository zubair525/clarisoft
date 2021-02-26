package com.crm.clarisoft.v1.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PurchaseOrder {
	
	public PurchaseOrder(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//img[contains(@alt,'Create Purchase Order')]")
	private WebElement plusimg;
	
	@FindBy(name="search_text")
	private WebElement searchtext;
	
	@FindBy(name="submit")
	private WebElement submitbtn;
	
	
}
