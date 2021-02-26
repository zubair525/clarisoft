package com.crm.clarisoft.v1.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.clarisoft.v1.genericLib.WebDriverUtilities;

public class Home {

	public Home(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()='Products']")
	private WebElement produt;

	@FindBy(xpath = "//a[text()='Leads']")
	private WebElement leads;

	@FindBy(xpath = "//a[text()='Organizations']")
	private WebElement organizations;

	@FindBy(xpath = "//a[text()='Contacts']")
	private WebElement contacts;

	@FindBy(xpath = "//a[text()='Opportunities']")
	private WebElement opportunities;

	@FindBy(xpath = "//a[text()='Documents']")
	private WebElement documents;

	@FindBy(xpath = "//a[text()='Email']")
	private WebElement email;

	@FindBy(xpath = "//a[text()='Trouble Tickets']")
	private WebElement troubletickets;

	@FindBy(xpath = "//a[text()='Dashboard']")
	private WebElement dashboard;

	@FindBy(xpath = "//a[text()='More']")
	private WebElement more;

	@FindBy(className = "searchBox")
	private WebElement searchbox;

	@FindBy(className = "searchBtn")
	private WebElement searchbtn;
	
	@FindBy(xpath = "//a[text()='Purchase Order']")
	private WebElement purchaseorder;
	
	@FindBy(xpath = "//a[text()='Vendors']")
	private WebElement vendors;
	
	@FindBy(xpath = "//a[text()='Invoice']")
	private WebElement invoice;
	
	@FindBy(xpath = "//a[text()='Sales Order']")
	private WebElement salesorder;
	
	@FindBy(xpath = "//a[text()='Quotes']")
	private WebElement quotes;
	
	@FindBy(xpath = "//a[text()='Services']")
	private WebElement services;
	
	@FindBy(xpath = "//a[text()='Price Books']")
	private WebElement pricebooks;

	public WebElement getPurchaseorder() {
		return purchaseorder;
	}

	public WebElement getVendors() {
		return vendors;
	}

	public WebElement getInvoice() {
		return invoice;
	}

	public WebElement getSalesorder() {
		return salesorder;
	}

	public WebElement getQuotes() {
		return quotes;
	}

	public WebElement getServices() {
		return services;
	}

	public WebElement getPricebooks() {
		return pricebooks;
	}

	public WebElement getProdut() {
		return produt;
	}

	public WebElement getLeads() {
		return leads;
	}

	public WebElement getOrganizations() {
		return organizations;
	}

	public WebElement getContacts() {
		return contacts;
	}

	public WebElement getOpportunities() {
		return opportunities;
	}

	public WebElement getDocuments() {
		return documents;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getTroubletickets() {
		return troubletickets;
	}

	public WebElement getDashboard() {
		return dashboard;
	}

	public WebElement getMore() {
		return more;
	}

	public WebElement getSearchbox() {
		return searchbox;
	}

	public WebElement getSearchbtn() {
		return searchbtn;
	}
	
	public void more(WebDriver driver) {
		WebDriverUtilities wutil=new WebDriverUtilities();
		wutil.mouseOverToElement(driver, getMore());
		getPurchaseorder().click();
	}
}
