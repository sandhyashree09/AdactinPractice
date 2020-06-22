package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automation.baseclass.BaseClass;

public class HConfirmationPage3 extends BaseClass{

	public static WebDriver driver;

	public HConfirmationPage3(WebDriver ldriver) {
		this.driver = ldriver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "radiobutton_0")
	private WebElement select;
	
	@FindBy(id = "continue")
	private WebElement hcontinue;

	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getSelect() {
		return select;
	}

	public WebElement getHcontinue() {
		return hcontinue;
	}
	
	
}
