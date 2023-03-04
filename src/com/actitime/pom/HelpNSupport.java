package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.yaml.snakeyaml.events.Event.ID;

public class HelpNSupport {

	@FindBy(xpath = "//a[contains(text(),'Introduction Video')]")
	private WebElement introductionVideoLink;
	
	//@FindBy(xpath = "//button[@class='ytp-large-play-button ytp-button ytp-large-play-button-red-bg']")
	@FindBy(xpath =  "//button[@class='introVideoPlaceholderId=\'Play\']")
	private WebElement videoPlayBtn;
	
	@FindBy(xpath = "\"//iframe[@src='https://www.youtube.com/embed/ByKEkJioprU?rel=0&controls=2&showinfo=0&enablejsapi=1&origin=https%3A%2F%2Fdemo.actitime.com&widgetid=1']\"")
	private WebElement linkChk;
	
	
	public HelpNSupport(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getIntroductionVideoLink() {
		return introductionVideoLink;
	}
	
	public WebElement getVideoPlayBtn() {
		return videoPlayBtn;
	}
	
	public WebElement getLinkChk() {
		return linkChk;
	}
}
