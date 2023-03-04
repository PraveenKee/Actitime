package com.actitime.testscript;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.pom.HelpNSupport;
import com.actitime.pom.HomePage;

@Listeners(com.actitime.generic.ListenerImplementation.class)
public class Help extends BaseClass {

	private static final String WebDriver = null;
	private WebDriver play;

	@Test
	public void testHelpNSupport() throws InterruptedException, AWTException {
		
		HomePage h = new HomePage(driver);
		HelpNSupport hs = new HelpNSupport(driver);
		
		h.setHelpNSupport();
		
		hs.getIntroductionVideoLink().click();
		Thread.sleep(5000);
		
//		driver.switchTo().frame(hs.getLinkChk());
		driver.switchTo().frame(hs.getVideoPlayBtn());
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		//hs.getVideoPlayBtn().click();
		/*
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	 wait.until(ExpectedConditions.visibilityOfElementLocated((By) hs.getVideoPlayBtn()));
		driver.switchTo().frame(0);
	
		hs.getVideoPlayBtn().click();
		
	/*	
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js .executeScript("document.getElementById(\"video\").play()");
		 
  
 //play video
 js .executeScript("document.getElementById(\"video\").play()");
 Thread.sleep(5000);
 
 jse.executeScript("jwplayer().play();");
 
 introVideoPlaceholderId
 "//iframe[@src='https://www.youtube.com/embed/ByKEkJioprU?rel=0&controls=2&showinfo=0&enablejsapi=1&origin=https%3A%2F%2Fdemo.actitime.com&widgetid=1']"
	*/	
		
//		JavascriptExecutor js =  (JavascriptExecutor) driver;
//		RemoteWebDriver rw = (RemoteWebDriver)driver;
//		rw.executeScript("document.getElementById(\"introVideoPlaceholderId\").play");
		//js.executeScript("jwplayer().play();");
}
}
