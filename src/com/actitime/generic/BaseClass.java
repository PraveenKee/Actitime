package com.actitime.generic;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.actitime.pom.HomePage;
import com.actitime.pom.LoginPage;
import com.actitime.pom.TaskListPage;

/**
 * This class is for openBrowser, Login, Logout and closeBrowser
 * @author Praveen K - QA
 *
 */

public class BaseClass {
	static {
	//	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static WebDriver driver;
	public FileLib f = new FileLib();
	//public static HomePage h = new HomePage(driver);
	//public static TaskListPage t = new TaskListPage(driver);
	
	@BeforeClass
	public void openBrowser() {
		Reporter.log("OpenBrowser", true);
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	}
	
	@AfterClass
	public void closeBrowser() {
		Reporter.log("CloseBrowser", true);
		driver.quit();
	}
	
	@BeforeMethod
	public void login() throws IOException {
		Reporter.log("Login", true);
		String url = f.getPropertyData("url");
		String un = f.getPropertyData("username");
		String pw = f.getPropertyData("password");
		driver.get(url);
		LoginPage l = new LoginPage(driver);
		l.setLogin(un, pw);
	}
	
	@AfterMethod
	public void logout() {
		Reporter.log("Logout", true);
		HomePage h = new HomePage(driver);
		h.setLogOut();
	}
}
