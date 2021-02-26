package Practise;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.crm.clarisoft.v1.ObjectRepository.Login;
import com.crm.clarisoft.v1.ObjectRepository.Logout;
import com.crm.clarisoft.v1.genericLib.FileDataUtility;
import com.crm.clarisoft.v1.genericLib.WebDriverUtilities;


public class Demo {
	FileDataUtility futil=new FileDataUtility();
	WebDriverUtilities wutil=new WebDriverUtilities();
	@Test
	public void loginToApplication() throws IOException {
		WebDriver driver=null;
		String url = futil.fetchDataFromProperty("Url");
		String browser = futil.fetchDataFromProperty("Browser");
		String userName = futil.fetchDataFromProperty("UserName");
		String password = futil.fetchDataFromProperty("Password");
		
		//Launch Browser
		if(browser.equalsIgnoreCase("chrome")) {
			driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox")) {
			driver=new FirefoxDriver();
		}
		wutil.waitTillPageIsLoaded(driver, 10);
		wutil.maximizeWindow(driver);
		driver.get(url);
		
		//Login to Application
		Login login =new Login(driver);
		
		login.loginToApp(userName, password);
		
		//Logout From the Application
		Logout logout = new Logout(driver);
		logout.logoutFromApp(driver);
		
	}
}
